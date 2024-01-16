package com.example.app1001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app1001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val listOfProduct = listOf<Product>(
            Product("Pear", 100, "https://c0.klipartz.com/pngpicture/1005/778/gratis-png-aguacate-verde-en-canasta-marron-backet-pera-thumbnail.png"),
            Product("Apple", 140, "https://c0.klipartz.com/pngpicture/824/571/gratis-png-vinagre-de-sidra-de-manzana-auglis-television-de-alta-definicion-manzana-roja-thumbnail.png"),
            Product("Cherry", 90, "https://c0.klipartz.com/pngpicture/786/215/gratis-png-cerezas-rojas-pastel-de-cereza-guinda-crujiente-cereza-thumbnail.png"),
            Product("Banana", 400, "https://c0.klipartz.com/pngpicture/784/238/gratis-png-platano-maduro-alimento-de-nutricion-de-platano-comiendo-fruta-un-platano-thumbnail.png"),
            Product("Strawberry", 490, "https://c0.klipartz.com/pngpicture/415/952/gratis-png-jugo-de-fresa-fresa-thumbnail.png"),
            Product("Cucumber", 500, "https://c0.klipartz.com/pngpicture/182/51/gratis-png-pepino-conservado-en-vinagre-pepinillo-spreewald-vida-util-vegetal-pepino-thumbnail.png"),
            Product("Onion", 120, "https://c0.klipartz.com/pngpicture/706/389/gratis-png-tv-de-escritorio-de-alta-definicion-ajo-cebolla-blanca-vegetal-ajo-thumbnail.png"),
            Product("Mandarin", 180, "https://c0.klipartz.com/pngpicture/575/704/gratis-png-cocina-vegetariana-mandarina-naranja-mandarina-clementina-mandarina-naranja-thumbnail.png"),
            Product("Lemon", 150, "https://c0.klipartz.com/pngpicture/480/280/gratis-png-vino-limonada-beber-comida-vino-thumbnail.png"),
            Product("Kiwi", 200, "https://c0.klipartz.com/pngpicture/918/985/sticker-png-kiwifruit-desktop-food-actinidia-deliciosa-kiwi-animado-food-nutrition-eating-desktop-wallpaper-fruit-thumbnail.png"),
            Product("Pineapple", 250, "https://c0.klipartz.com/pngpicture/361/195/gratis-png-jugo-de-batido-de-pina-ensalada-de-fruta-stock-photography-jugo-thumbnail.png"),
            Product("Mango", 300, "https://c0.klipartz.com/pngpicture/938/1008/sticker-png-mango-mango-natural-foods-food-desktop-wallpaper-fruit-superfood-thumbnail.png"),
            Product("Grapefruit", 180, "https://c0.klipartz.com/pngpicture/877/370/gratis-png-zumo-de-pomelo-sabor-naranja-pomelo-thumbnail.png"),
            Product("Grape", 120,"https://c0.klipartz.com/pngpicture/944/390/gratis-png-uva-kyoho-vino-blanco-cardinal-uva-uva-thumbnail.png"),
            Product("Tomato", 80, "https://c0.klipartz.com/pngpicture/736/450/gratis-png-sopa-de-tomate-cocina-maltesa-jugo-de-tomate-crema-tomate-thumbnail.png"),
            Product("Carrot", 60, "https://c0.klipartz.com/pngpicture/204/531/gratis-png-baby-carrot-mart-ng-comida-vegetariana-come-bien-thumbnail.png"),
            Product("Potato", 50, "https://c0.klipartz.com/pngpicture/931/301/gratis-png-hoja-de-verdura-alimentos-organicos-patata-cebolla-fruta-vegetal-thumbnail.png"),
            Product("Broccoli", 90, "https://c0.klipartz.com/pngpicture/439/930/gratis-png-brocoli-brocoli-thumbnail.png"),
            Product("Raspberry", 300, "https://c0.klipartz.com/pngpicture/961/601/gratis-png-pinot-noir-vino-tinto-de-frambuesa-frambuesa-thumbnail.png"),
            Product("Blueberry", 200, "https://c0.klipartz.com/pngpicture/230/763/gratis-png-blueberry-arandano-uva-cigarrillo-electronico-aerosol-y-liquido-blueberry-cartoon-thumbnail.png"),
            Product("Watermelon", 180, "https://c0.klipartz.com/pngpicture/472/780/gratis-png-cigarrillo-electronico-sabor-a-sandia-aerosol-y-fruta-liquida-deliciosa-sandia-fresca-hd-s-thumbnail.png"),
            Product("Avocado", 350, "https://c0.klipartz.com/pngpicture/787/734/gratis-png-verduras-hass-aguacate-ensalada-de-aguacate-comida-aguacate-tostadas-vegetales-thumbnail.png"),
            Product("Peach", 120, "https://c0.klipartz.com/pngpicture/364/995/gratis-png-graficos-de-red-portatiles-peach-iconos-de-computadora-melocoton-suculento-thumbnail.png"),
            Product("Plum", 180, "https://c0.klipartz.com/pngpicture/876/90/gratis-png-muesli-ciruela-comun-auglis-mermelada-de-frutas-ciruela-thumbnail.png"),
            Product("Asparagus", 120, "https://c0.klipartz.com/pngpicture/637/166/gratis-png-manojo-de-esparragos-vegetales-bruschetta-alimentos-vegetales-thumbnail.png"),
            Product("Spinach", 130, "https://c0.klipartz.com/pngpicture/626/7/gratis-png-alimentos-organicos-espinacas-vegetales-soleados-tomate-feta-vegetales-thumbnail.png"),
            Product("Pomegranate", 250, "https://c0.klipartz.com/pngpicture/703/776/gratis-png-jugo-de-granada-fruta-cocina-irani-jugo-thumbnail.png"),
            Product("Blackberry", 170, "https://c0.klipartz.com/pngpicture/534/536/gratis-png-blackberry-blackberry-frambuesa-amora-blackberry-thumbnail.png"),
            Product("Cauliflower", 120, "https://c0.klipartz.com/pngpicture/213/649/gratis-png-aloo-gobi-coliflor-paratha-verdura-gulab-jamun-coliflor-thumbnail.png"),
            Product("Apricot", 200, "https://c0.klipartz.com/pngpicture/149/881/gratis-png-vaisiaus-kauliukas-apricot-kernel-amygdalin-kompot-apricot-thumbnail.png"),
            Product("Papaya", 280, "https://c0.klipartz.com/pngpicture/834/276/gratis-png-rebanada-de-papaya-amarilla-jugo-de-ensalada-de-papaya-verde-naranja-fruta-tropical-archivo-de-papaya-thumbnail.png")
        )



        val adapter = AppRecycleAdapter()

        binding.rcProducts.adapter = adapter

        adapter.submitList(listOfProduct)

        val fragment1 = ExampleFirstFragment()
             binding.btnShowFirstFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().add(binding.tvPlaceForFragment.id, fragment1).commit()
        }

        val fragment2 = ExampleSecondFragment()

        binding.button5.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(binding.tvPlaceForFragment.id, fragment2).commit()
        }

        binding.btnRemoveFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().remove(fragment1).commit()
            supportFragmentManager.beginTransaction().remove(fragment2).commit()
        }

    }
}