<template>
	<div style="margin-left:150px">
		<Button
			:loading="loading"
			icon="md-planet"
			@click="init"
			size="large"
		>
			<span v-if="!loading">重新加载!</span>
			<span v-else>加载中...</span>
		</Button>
		<br>
		<br>
		<Table
			:loading="loading"
			width="1220"
			height="500"
			border
			:columns="columns"
			:data="data"
		></Table>
	</div>
</template>
<script>
export default {
	data() {
		return {
			columns: [
				{
					title: '服务器名',
					key: 'HostName',
					width: 350,
					// fixed: 'left',
				},
				{
					title: '当前地图',
					key: 'MapChi',
					width: 200,
				},
				{
					title: '玩家数',
					key: 'Players',
					width: 100,
				},
				{
					title: '版本',
					key: 'Version',
					width: 100,
				},
				{
					title: '原地图名',
					key: 'Map',
					width: 200,
				},
				{
					title: '游戏',
					key: 'ModDir',
					width: 100,
				},
				{
					title: 'Action',
					key: 'action',
					// fixed: 'right',
					width: 150,
					render: (h, params) => {
						return h('div', [
							// h(
							// 	'Button',
							// 	{
							// 		props: {
							// 			type: 'text',
							// 			size: 'small',
							// 		},
							// 	},
							// 	'View'
							// ),
							h(
								'Button',
								{
									props: {
										type: 'text',
										size: 'small',
										// click: init(),
									},
									on: {
										click: () => {
											this.joinGame(params.index)
										},
									},
								},
								'加入游戏===》'
							),
						])
					},
				},
			],
			data: [],
			runCS: 'steam://rungame/730/76561202255233023/+connect%20',
			loading: false,
		}
	},
	mounted() {
		this.init()
	},
	methods: {
		joinGame(val) {
			// ip: "cs2.zombieden.cn:27050"
			// steam://rungame/730/76561202255233023/+connect%20cs2.zombieden.cn:27050
			console.log(this.data[val].ip)
			window.location.href = this.runCS + this.data[val].ip
		},
		init() {
			this.loading = true
			this.$http
				.get('/papa/getZombies')
				.then((res) => {
					console.log(res)
					this.data = res.data
					this.loading = false
				})
				.catch((err) => {
					// alert('请求失败')
					console.log(err)
				})
		},
	},
}
</script>