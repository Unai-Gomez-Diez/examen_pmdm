package com.iesam.ex_22_23_pmdm_marzo.app.mock

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionDetailLocalModel
import com.iesam.ex_22_23_pmdm_marzo.feature.data.AdoptionLocalModel
import com.iesam.ex_22_23_pmdm_marzo.feature.domain.Adoption
import java.lang.reflect.Type


fun obtainJsonFromRaw(): String {
    return "[\n" +
            "  {\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"Rami\",\n" +
            "\t\"short_description\": \"Un diamante sin pulir\",\n" +
            "    \"description\": \"Rami viene de convivir con un grupo de 15 perros que vivian hacinados en una casa en malas condiciones. la rescatamos junto con sus hermanos o primos, y casi todos ellos han encongtrado una casa despue´s de que hayamos necesitado mucha paciencia y tesón para quitarles el miedo, ir de la correa y del arnés, ganar poco a poco confianza. Es pequeña, un poco desconfiada todavía, pero estamos seguras de que se va a adaptar muy bien en un ambiente tranquilo que le ayude a su estabilidad emocional. Si no puedes adoptar a RAMI , puedes apadrinarla: Nos ayudas y la ayudas:https://www.protectorahuellas.org/ayudanos/apadrina\",\n" +
            "    \"breed\": \"Mestiza\",\n" +
            "    \"sex\": \"Hembra\",\n" +
            "    \"date_born\": \"01-01-2021\",\n" +
            "    \"size\": \"Medio\",\n" +
            "    \"url_image\": \"https://www.protectorahuellas.org/media/k2/items/cache/f4bbebcbdcc4b70522073388c7b5f8e3_M.jpg\",\n" +
            "\t\"url_source\": \"https://www.protectorahuellas.org/adopcion-de-perros/perros-en-adopcion/item/6913-6913\",  \n" +
            "    \"type\": {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Perro\"\n" +
            "    },\n" +
            "\t\"gallery\": [\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Rami/Rami_02.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Rami/Rami_03.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Rami/Rami_04.png\"\n" +
            "\t]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2,\n" +
            "    \"name\": \"Maylo\",\n" +
            "\t\"short_description\": \"Salvados del abandono\",\n" +
            "    \"description\": \"A Maylo y sus siete hermanos, cinco chicos y tres chicas,  los rescatamos junto con su madre cuando eran recien nacidos. Estaban en un chamizo abandonado en un pueblo de unos pocos vecinos, que llevaban viendo a la madre desde dias atras, y que deambulaba por las afueras del pueblo. los hermanos han crecido con su madre, que ya fue adoptada. Hoy los siete hermanos están con nosotros, porque uno de ellos ya fue adoptado. Buscamos una casa para cada uno de ellos. Quizá no puedas adoptar a Akai, pero puedes apadrinarlo, nos ayudas y le ayudas https://www.protectorahuellas.org/ayudanos/apadrina\",\n" +
            "    \"breed\": \"Mestizo\",\n" +
            "    \"sex\": \"Macho\",\n" +
            "    \"date_born\": \"01/05/2022\",\n" +
            "    \"size\": \"mediano\",\n" +
            "    \"url_image\": \"https://www.protectorahuellas.org/media/k2/items/cache/b4d5a674fef05c43ec29cbda5cb2ab5d_M.jpg\",\n" +
            "\t\"url_source\": \"https://www.protectorahuellas.org/adopcion-de-perros/perros-en-adopcion/item/6912-6912\",  \n" +
            "    \"type\": {\n" +
            "      \"id\": 2,\n" +
            "      \"name\": \"Gato\"\n" +
            "    },\n" +
            "\t\"gallery\": [\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Maylo/Maylo_02.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Maylo/Maylo_03.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Maylo/maylo_05.png\"\n" +
            "\t]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 3,\n" +
            "    \"name\": \"Akai\",\n" +
            "\t\"short_description\": \"Salvados del abandono\",\n" +
            "    \"description\": \"A Akai y sus siete hermanos los rescatamos junto con su madre cuando eran recien nacidos. Estaban en un chamizo abandonado en un pueblo de unos pocos vecinos, que llevaban viendo a la madre desde dias atras, y que deambulaba por las afueras del pueblo. los hermanos han crecido con su madre, que ya fue adoptada. Hoy los siete hermanos están con nosotros, y uno de ellos ya fue adoptado. Buscamos una casa para cada uno de ellos. Quizá no puedas adoptar a Akai, pero puedes apadrinarlo, nos ayudas y le ayudas https://www.protectorahuellas.org/ayudanos/apadrina\",\n" +
            "    \"breed\": \"Mestizo\",\n" +
            "    \"sex\": \"Macho\",\n" +
            "    \"date_born\": \"01/05/2022\",\n" +
            "    \"size\": \"mediano\",\n" +
            "    \"url_image\": \"https://www.protectorahuellas.org/media/k2/items/cache/33202be39b7e1e522952d330739a4f4d_XL.jpg\",\n" +
            "\t\"url_source\": \"https://www.protectorahuellas.org/adopcion-de-perros/perros-en-adopcion/item/6911-6911\",  \n" +
            "    \"type\": {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Perro\"\n" +
            "    },\n" +
            "\t\"gallery\": [\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Akai/Akai_02.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Akai/Akai_03.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Akai/Akai_04.png\"\n" +
            "\t]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 4,\n" +
            "    \"name\": \"Estela\",\n" +
            "\t\"short_description\": \"Un gran drama\",\n" +
            "    \"description\": \"La encontramos sola, triste, por la orilla de una carretera no lejana a un pueblo. Siempre pensamso en estos casos que un animal tan bueno de carácter y tan apacible no puede haber sido echado a la calle, Pero aquí está. nadie ha preguntado por ella, nadie la busca. Es joven, tranquila, amable... Quizá puedas adoptar a Esteñla, si no , puedes apadrinarla, nos ayudas y la ayudas. https://www.protectorahuellas.org/ayudanos/apadrina\",\n" +
            "    \"breed\": \"Dogo Mestizo\",\n" +
            "    \"sex\": \"Hembra\",\n" +
            "    \"date_born\": \"11/01/2022\",\n" +
            "    \"size\": \"Mediano\",\n" +
            "    \"url_image\": \"https://www.protectorahuellas.org/media/k2/items/cache/1ad0cda0b78013d5416841bcb457fbc2_XL.jpg\",\n" +
            "\t\"url_source\": \"https://www.protectorahuellas.org/adopcion-de-perros/perros-en-adopcion/item/6908-6908\",  \n" +
            "    \"type\": {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Perro\"\n" +
            "    },\n" +
            "\t\"gallery\": [\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Estela/Estela_02.jpg\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Estela/Estela_03.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Estela/Estela_04.png\"\n" +
            "\t]\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 5,\n" +
            "    \"name\": \"Vila\",\n" +
            "\t\"short_description\": \"Somos responsables de su bienestar\",\n" +
            "    \"description\": \"Vila estaba atada una mañana del mes de noviembre a una verja de un parque. Pasaba mucha gente por alli y todo el mundo pensó que su dueño o dueña estaría dentro en algun establecimiento cercano, pero no. Pasaron horas y horas y nadie la recogió , hasta que una llamada a nuestro teléfono nos alertó de que esta perra llevaba horas y horas alli atada, y además tan corta con la correa , que no podía ni sentarse. Y fuimos a buscarla. Es un poco nerviosa y activa todavía, es joven, necesita entrenamiento, pero es muy cariñosa. ideal para ir de marcha por el monte, por ejmplo. Si no puedes adoptar a VILA, puedes apadrinarla, nos ayudas y la ayudas. https://www.protectorahuellas.org/ayudanos/apadrina\",\n" +
            "    \"breed\": \"Cruce Pastor Belga\",\n" +
            "    \"sex\": \"Hembra\",\n" +
            "    \"date_born\": \"22/02/2022\",\n" +
            "    \"size\": \"Grande\",\n" +
            "    \"url_image\": \"https://www.protectorahuellas.org/media/k2/items/cache/eafb661feb55b7e231a0edea0de3ee57_XL.jpg\",\n" +
            "\t\"url_source\": \"https://www.protectorahuellas.org/adopcion-de-perros/perros-en-adopcion/item/6902-6902\",  \n" +
            "    \"type\": {\n" +
            "      \"id\": 1,\n" +
            "      \"name\": \"Perro\"\n" +
            "    },\n" +
            "\t\"gallery\": [\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Vila/Vila04.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Vila/Vila_02.png\",\n" +
            "\t\t\"https://www.protectorahuellas.org/images/adopciones/perros/Vila/Vila_03.png\"\n" +
            "\t]\n" +
            "  }\n" +
            "]"
}

fun obtainAdoptions(): List<AdoptionLocalModel> {
    val typeList: Type = object : TypeToken<ArrayList<AdoptionLocalModel>>() {}.type
    return Gson().fromJson(obtainJsonFromRaw(), typeList)
}

fun obtainAdoptionDetail(): List<AdoptionDetailLocalModel> {
    val typeList: Type = object : TypeToken<ArrayList<AdoptionDetailLocalModel>>() {}.type
    return Gson().fromJson(obtainJsonFromRaw(), typeList)
}