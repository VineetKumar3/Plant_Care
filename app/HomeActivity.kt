class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlantAdapter
    private lateinit var plantList: ArrayList<Plant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerPlants)
        val btnAddPlant = findViewById<Button>(R.id.btnAddPlant)

        plantList = arrayListOf(
            Plant("Aloe Vera", "Every 2 days"),
            Plant("Money Plant", "Daily"),
            Plant("Snake Plant", "Weekly")
        )

        adapter = PlantAdapter(plantList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnAddPlant.setOnClickListener {
            Toast.makeText(this, "Add Plant Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
