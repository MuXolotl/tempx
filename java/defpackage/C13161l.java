package defpackage;

import android.content.res.Resources;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import org.json.JSONArray;
import org.json.JSONException;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lؘِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C13161l implements InterfaceC1771l, InterfaceC12833l, InterfaceC15838l, InterfaceC9576l, InterfaceC16334l, InterfaceC18517l, InterfaceC14606l, InterfaceC17475l, NotificationCallback, InterfaceC2232l, InterfaceC4041l, InterfaceC6684l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14457l f25774l = new C14457l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile C13161l f25775l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f25776l;

    public C13161l(int i, boolean z) {
        switch (i) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f25776l = new LinkedHashMap();
                break;
            default:
                C13698l c13698lYandex = AbstractC13675l.yandex();
                c13698lYandex.mo3668catch("aar", "Afar");
                c13698lYandex.mo3668catch("abk", "Abkhazian");
                c13698lYandex.mo3668catch("ace", "Achinese");
                c13698lYandex.mo3668catch("ach", "Acoli");
                c13698lYandex.mo3668catch("ada", "Adangme");
                c13698lYandex.mo3668catch("afa", "Afro-Asiatic");
                c13698lYandex.mo3668catch("afh", "Afrihili");
                c13698lYandex.mo3668catch("afr", "Afrikaans");
                c13698lYandex.mo3668catch("aka", "Akan");
                c13698lYandex.mo3668catch("akk", "Akkadian");
                c13698lYandex.mo3668catch("alb", "Albanian");
                c13698lYandex.mo3668catch("ale", "Aleut");
                c13698lYandex.mo3668catch("alg", "Algonquian languages");
                c13698lYandex.mo3668catch("amh", "Amharic");
                c13698lYandex.mo3668catch("ang", "Old English,(ca.450-1100)");
                c13698lYandex.mo3668catch("apa", "Apache languages");
                c13698lYandex.mo3668catch("ara", "Arabic");
                c13698lYandex.mo3668catch("arc", "Aramaic");
                c13698lYandex.mo3668catch("arm", "Armenian");
                c13698lYandex.mo3668catch("arn", "Araucanian");
                c13698lYandex.mo3668catch("arp", "Arapaho");
                c13698lYandex.mo3668catch("art", "Artificial");
                c13698lYandex.mo3668catch("arw", "Arawak");
                c13698lYandex.mo3668catch("asm", "Assamese");
                c13698lYandex.mo3668catch("ast", "Asturian Bable");
                c13698lYandex.mo3668catch("ath", "Athapascan languages");
                c13698lYandex.mo3668catch("aus", "Australian languages");
                c13698lYandex.mo3668catch("ava", "Avaric");
                c13698lYandex.mo3668catch("ave", "Avestan");
                c13698lYandex.mo3668catch("awa", "Awadhi");
                c13698lYandex.mo3668catch("aym", "Aymara");
                c13698lYandex.mo3668catch("aze", "Azerbaijani");
                c13698lYandex.mo3668catch("bad", "Banda");
                c13698lYandex.mo3668catch("bai", "Bamileke languages");
                c13698lYandex.mo3668catch("bak", "Bashkir");
                c13698lYandex.mo3668catch("bal", "Baluchi");
                c13698lYandex.mo3668catch("bam", "Bambara");
                c13698lYandex.mo3668catch("ban", "Balinese");
                c13698lYandex.mo3668catch("baq", "Basque");
                c13698lYandex.mo3668catch("bas", "Basa");
                c13698lYandex.mo3668catch("bat", "Baltic");
                c13698lYandex.mo3668catch("bej", "Beja");
                c13698lYandex.mo3668catch("bel", "Belarusian");
                c13698lYandex.mo3668catch("bem", "Bemba");
                c13698lYandex.mo3668catch("ben", "Bengali");
                c13698lYandex.mo3668catch("ber", "Berber");
                c13698lYandex.mo3668catch("bho", "Bhojpuri");
                c13698lYandex.mo3668catch("bih", "Bihari");
                c13698lYandex.mo3668catch("bik", "Bikol");
                c13698lYandex.mo3668catch("bin", "Bini");
                c13698lYandex.mo3668catch("bis", "Bislama");
                c13698lYandex.mo3668catch("bla", "Siksika");
                c13698lYandex.mo3668catch("bnt", "Bantu");
                c13698lYandex.mo3668catch("bod", "Tibetan");
                c13698lYandex.mo3668catch("bos", "Bosnian");
                c13698lYandex.mo3668catch("bra", "Braj");
                c13698lYandex.mo3668catch("bre", "Breton");
                c13698lYandex.mo3668catch("btk", "Batak (Indonesia)");
                c13698lYandex.mo3668catch("bua", "Buriat");
                c13698lYandex.mo3668catch("bug", "Buginese");
                c13698lYandex.mo3668catch("bul", "Bulgarian");
                c13698lYandex.mo3668catch("bur", "Burmese");
                c13698lYandex.mo3668catch("cad", "Caddo");
                c13698lYandex.mo3668catch("cai", "Central American Indian");
                c13698lYandex.mo3668catch("car", "Carib");
                c13698lYandex.mo3668catch("cat", "Catalan");
                c13698lYandex.mo3668catch("cau", "Caucasian");
                c13698lYandex.mo3668catch("ceb", "Cebuano");
                c13698lYandex.mo3668catch("cel", "Celtic");
                c13698lYandex.mo3668catch("ces", "Czech");
                c13698lYandex.mo3668catch("cha", "Chamorro");
                c13698lYandex.mo3668catch("chb", "Chibcha");
                c13698lYandex.mo3668catch("che", "Chechen");
                c13698lYandex.mo3668catch("chg", "Chagatai");
                c13698lYandex.mo3668catch("chi", "Chinese");
                c13698lYandex.mo3668catch("chk", "Chuukese");
                c13698lYandex.mo3668catch("chm", "Mari");
                c13698lYandex.mo3668catch("chn", "Chinook jargon");
                c13698lYandex.mo3668catch("cho", "Choctaw");
                c13698lYandex.mo3668catch("chp", "Chipewyan");
                c13698lYandex.mo3668catch("chr", "Cherokee");
                c13698lYandex.mo3668catch("chu", "Church Slavic");
                c13698lYandex.mo3668catch("chv", "Chuvash");
                c13698lYandex.mo3668catch("chy", "Cheyenne");
                c13698lYandex.mo3668catch("cmc", "Chamic languages");
                c13698lYandex.mo3668catch("cop", "Coptic");
                c13698lYandex.mo3668catch("cor", "Cornish");
                c13698lYandex.mo3668catch("cos", "Corsican");
                c13698lYandex.mo3668catch("cpe", "Creoles and pidgins, English based");
                c13698lYandex.mo3668catch("cpf", "Creoles and pidgins, French based");
                c13698lYandex.mo3668catch("cpp", "Creoles and pidgins, Portuguese-based");
                c13698lYandex.mo3668catch("cre", "Cree");
                c13698lYandex.mo3668catch("crp", "Creoles and pidgins");
                c13698lYandex.mo3668catch("cus", "Cushitic");
                c13698lYandex.mo3668catch("cym", "Welsh");
                c13698lYandex.mo3668catch("cze", "Czech");
                c13698lYandex.mo3668catch("dak", "Dakota");
                c13698lYandex.mo3668catch("dan", "Danish");
                c13698lYandex.mo3668catch("day", "Dayak");
                c13698lYandex.mo3668catch("del", "Delaware");
                c13698lYandex.mo3668catch("den", "Slave (Athapascan)");
                c13698lYandex.mo3668catch("deu", "German");
                c13698lYandex.mo3668catch("dgr", "Dogrib");
                c13698lYandex.mo3668catch("din", "Dinka");
                c13698lYandex.mo3668catch("div", "Divehi");
                c13698lYandex.mo3668catch("doi", "Dogri");
                c13698lYandex.mo3668catch("dra", "Dravidian");
                c13698lYandex.mo3668catch("dua", "Duala");
                c13698lYandex.mo3668catch("dum", "Dutch, Middle (ca.1050-1350)");
                c13698lYandex.mo3668catch("dut", "Dutch");
                c13698lYandex.mo3668catch("dyu", "Dyula");
                c13698lYandex.mo3668catch("dzo", "Dzongkha");
                c13698lYandex.mo3668catch("efi", "Efik");
                c13698lYandex.mo3668catch("egy", "Egyptian (Ancient)");
                c13698lYandex.mo3668catch("eka", "Ekajuk");
                c13698lYandex.mo3668catch("ell", "Greek, Modern (1453-)");
                c13698lYandex.mo3668catch("elx", "Elamite");
                c13698lYandex.mo3668catch("eng", "English");
                c13698lYandex.mo3668catch("enm", "English, Middle (1100-1500)");
                c13698lYandex.mo3668catch("epo", "Esperanto");
                c13698lYandex.mo3668catch("est", "Estonian");
                c13698lYandex.mo3668catch("eus", "Basque");
                c13698lYandex.mo3668catch("ewe", "Ewe");
                c13698lYandex.mo3668catch("ewo", "Ewondo");
                c13698lYandex.mo3668catch("fan", "Fang");
                c13698lYandex.mo3668catch("fao", "Faroese");
                c13698lYandex.mo3668catch("fas", "Persian");
                c13698lYandex.mo3668catch("fat", "Fanti");
                c13698lYandex.mo3668catch("fij", "Fijian");
                c13698lYandex.mo3668catch("fin", "Finnish");
                c13698lYandex.mo3668catch("fiu", "Finno-Ugrian");
                c13698lYandex.mo3668catch("fon", "Fon");
                c13698lYandex.mo3668catch("fra", "French");
                c13698lYandex.mo3668catch("frm", "French, Middle (ca.1400-1800)");
                c13698lYandex.mo3668catch("fro", "French, Old (842-ca.1400)");
                c13698lYandex.mo3668catch("fry", "Frisian");
                c13698lYandex.mo3668catch("ful", "Fulah");
                c13698lYandex.mo3668catch("fur", "Friulian");
                c13698lYandex.mo3668catch("gaa", "Ga");
                c13698lYandex.mo3668catch("gay", "Gayo");
                c13698lYandex.mo3668catch("gba", "Gbaya");
                c13698lYandex.mo3668catch("gem", "Germanic");
                c13698lYandex.mo3668catch("geo", "Georgian");
                c13698lYandex.mo3668catch("ger", "German");
                c13698lYandex.mo3668catch("gez", "Geez");
                c13698lYandex.mo3668catch("gil", "Gilbertese");
                c13698lYandex.mo3668catch("gla", "Gaelic Scottish Gaelic");
                c13698lYandex.mo3668catch("gle", "Irish");
                c13698lYandex.mo3668catch("glg", "Gallegan");
                c13698lYandex.mo3668catch("glv", "Manx");
                c13698lYandex.mo3668catch("gmh", "German, Middle High (ca.1050-1500)");
                c13698lYandex.mo3668catch("goh", "German, Old High (ca.750-1050)");
                c13698lYandex.mo3668catch("gon", "Gondi");
                c13698lYandex.mo3668catch("gor", "Gorontalo");
                c13698lYandex.mo3668catch("got", "Gothic");
                c13698lYandex.mo3668catch("grb", "Grebo");
                c13698lYandex.mo3668catch("grc", "Greek, Ancient (to 1453)");
                c13698lYandex.mo3668catch("gre", "Greek, Modern (1453-)");
                c13698lYandex.mo3668catch("grn", "Guarani");
                c13698lYandex.mo3668catch("guj", "Gujarati");
                c13698lYandex.mo3668catch("gwi", "Gwich´in");
                c13698lYandex.mo3668catch("hai", "Haida");
                c13698lYandex.mo3668catch("hau", "Hausa");
                c13698lYandex.mo3668catch("haw", "Hawaiian");
                c13698lYandex.mo3668catch("heb", "Hebrew");
                c13698lYandex.mo3668catch("her", "Herero");
                c13698lYandex.mo3668catch("hil", "Hiligaynon");
                c13698lYandex.mo3668catch("him", "Himachali");
                c13698lYandex.mo3668catch("hin", "Hindi");
                c13698lYandex.mo3668catch("hit", "Hittite");
                c13698lYandex.mo3668catch("hmn", "Hmong");
                c13698lYandex.mo3668catch("hmo", "Hiri Motu");
                c13698lYandex.mo3668catch("hrv", "Croatian");
                c13698lYandex.mo3668catch("hun", "Hungarian");
                c13698lYandex.mo3668catch("hup", "Hupa");
                c13698lYandex.mo3668catch("hye", "Armenian");
                c13698lYandex.mo3668catch("iba", "Iban");
                c13698lYandex.mo3668catch("ibo", "Igbo");
                c13698lYandex.mo3668catch("ice", "Icelandic");
                c13698lYandex.mo3668catch("ido", "Ido");
                c13698lYandex.mo3668catch("ijo", "Ijo");
                c13698lYandex.mo3668catch("iku", "Inuktitut");
                c13698lYandex.mo3668catch("ile", "Interlingue");
                c13698lYandex.mo3668catch("ilo", "Iloko");
                c13698lYandex.mo3668catch("ina", "Interlingua");
                c13698lYandex.mo3668catch("inc", "Indic");
                c13698lYandex.mo3668catch("ind", "Indonesian");
                c13698lYandex.mo3668catch("ine", "Indo-European");
                c13698lYandex.mo3668catch("ipk", "Inupiaq");
                c13698lYandex.mo3668catch("ira", "Iranian (Other)");
                c13698lYandex.mo3668catch("iro", "Iroquoian languages");
                c13698lYandex.mo3668catch("isl", "Icelandic");
                c13698lYandex.mo3668catch("ita", "Italian");
                c13698lYandex.mo3668catch("jav", "Javanese");
                c13698lYandex.mo3668catch("jpn", "Japanese");
                c13698lYandex.mo3668catch("jpr", "Judeo-Persian");
                c13698lYandex.mo3668catch("jrb", "Judeo-Arabic");
                c13698lYandex.mo3668catch("kaa", "Kara-Kalpak");
                c13698lYandex.mo3668catch("kab", "Kabyle");
                c13698lYandex.mo3668catch("kac", "Kachin");
                c13698lYandex.mo3668catch("kal", "Kalaallisut");
                c13698lYandex.mo3668catch("kam", "Kamba");
                c13698lYandex.mo3668catch("kan", "Kannada");
                c13698lYandex.mo3668catch("kar", "Karen");
                c13698lYandex.mo3668catch("kas", "Kashmiri");
                c13698lYandex.mo3668catch("kat", "Georgian");
                c13698lYandex.mo3668catch("kau", "Kanuri");
                c13698lYandex.mo3668catch("kaw", "Kawi");
                c13698lYandex.mo3668catch("kaz", "Kazakh");
                c13698lYandex.mo3668catch("kha", "Khasi");
                c13698lYandex.mo3668catch("khi", "Khoisan");
                c13698lYandex.mo3668catch("khm", "Khmer");
                c13698lYandex.mo3668catch("kho", "Khotanese");
                c13698lYandex.mo3668catch("kik", "Kikuyu Gikuyu");
                c13698lYandex.mo3668catch("kin", "Kinyarwanda");
                c13698lYandex.mo3668catch("kir", "Kirghiz");
                c13698lYandex.mo3668catch("kmb", "Kimbundu");
                c13698lYandex.mo3668catch("kok", "Konkani");
                c13698lYandex.mo3668catch("kom", "Komi");
                c13698lYandex.mo3668catch("kon", "Kongo");
                c13698lYandex.mo3668catch("kor", "Korean");
                c13698lYandex.mo3668catch("kos", "Kosraean");
                c13698lYandex.mo3668catch("kpe", "Kpelle");
                c13698lYandex.mo3668catch("kro", "Kru");
                c13698lYandex.mo3668catch("kru", "Kurukh");
                c13698lYandex.mo3668catch("kua", "Kuanyama Kwanyama");
                c13698lYandex.mo3668catch("kum", "Kumyk");
                c13698lYandex.mo3668catch("kur", "Kurdish");
                c13698lYandex.mo3668catch("kut", "Kutenai");
                c13698lYandex.mo3668catch("lad", "Ladino");
                c13698lYandex.mo3668catch("lah", "Lahnda");
                c13698lYandex.mo3668catch("lam", "Lamba");
                c13698lYandex.mo3668catch("lao", "Lao");
                c13698lYandex.mo3668catch("lat", "Latin");
                c13698lYandex.mo3668catch("lav", "Latvian");
                c13698lYandex.mo3668catch("lez", "Lezghian");
                c13698lYandex.mo3668catch("lin", "Lingala");
                c13698lYandex.mo3668catch("lit", "Lithuanian");
                c13698lYandex.mo3668catch("lol", "Mongo");
                c13698lYandex.mo3668catch("loz", "Lozi");
                c13698lYandex.mo3668catch("ltz", "Luxembourgish Letzeburgesch");
                c13698lYandex.mo3668catch("lua", "Luba-Lulua");
                c13698lYandex.mo3668catch("lub", "Luba-Katanga");
                c13698lYandex.mo3668catch("lug", "Ganda");
                c13698lYandex.mo3668catch("lui", "Luiseno");
                c13698lYandex.mo3668catch("lun", "Lunda");
                c13698lYandex.mo3668catch("luo", "Luo (Kenya and Tanzania)");
                c13698lYandex.mo3668catch("lus", "lushai");
                c13698lYandex.mo3668catch("mac", "Macedonian");
                c13698lYandex.mo3668catch("mad", "Madurese");
                c13698lYandex.mo3668catch("mag", "Magahi");
                c13698lYandex.mo3668catch("mah", "Marshallese");
                c13698lYandex.mo3668catch("mai", "Maithili");
                c13698lYandex.mo3668catch("mak", "Makasar");
                c13698lYandex.mo3668catch("mal", "Malayalam");
                c13698lYandex.mo3668catch("man", "Mandingo");
                c13698lYandex.mo3668catch("mao", "Maori");
                c13698lYandex.mo3668catch("map", "Austronesian");
                c13698lYandex.mo3668catch("mar", "Marathi");
                c13698lYandex.mo3668catch("mas", "Masai");
                c13698lYandex.mo3668catch("may", "Malay");
                c13698lYandex.mo3668catch("mdr", "Mandar");
                c13698lYandex.mo3668catch("men", "Mende");
                c13698lYandex.mo3668catch("mga", "Irish, Middle (900-1200)");
                c13698lYandex.mo3668catch("mic", "Micmac");
                c13698lYandex.mo3668catch("min", "Minangkabau");
                c13698lYandex.mo3668catch("mis", "Miscellaneous languages");
                c13698lYandex.mo3668catch("mkd", "Macedonian");
                c13698lYandex.mo3668catch("mkh", "Mon-Khmer");
                c13698lYandex.mo3668catch("mlg", "Malagasy");
                c13698lYandex.mo3668catch("mlt", "Maltese");
                c13698lYandex.mo3668catch("mnc", "Manchu");
                c13698lYandex.mo3668catch("mni", "Manipuri");
                c13698lYandex.mo3668catch("mno", "Manobo languages");
                c13698lYandex.mo3668catch("moh", "Mohawk");
                c13698lYandex.mo3668catch("mol", "Moldavian");
                c13698lYandex.mo3668catch("mon", "Mongolian");
                c13698lYandex.mo3668catch("mos", "Mossi");
                c13698lYandex.mo3668catch("mri", "Maori");
                c13698lYandex.mo3668catch("msa", "Malay");
                c13698lYandex.mo3668catch("mul", "Multiple languages");
                c13698lYandex.mo3668catch("mun", "Munda languages");
                c13698lYandex.mo3668catch("mus", "Creek");
                c13698lYandex.mo3668catch("mwr", "Marwari");
                c13698lYandex.mo3668catch("mya", "Burmese");
                c13698lYandex.mo3668catch("myn", "Mayan languages");
                c13698lYandex.mo3668catch("nah", "Nahuatl");
                c13698lYandex.mo3668catch("nai", "North American Indian");
                c13698lYandex.mo3668catch("nau", "Nauru");
                c13698lYandex.mo3668catch("nav", "Navajo Navaho");
                c13698lYandex.mo3668catch("nbl", "South Ndebele");
                c13698lYandex.mo3668catch("nde", "North Ndebele");
                c13698lYandex.mo3668catch("ndo", "Ndonga");
                c13698lYandex.mo3668catch("nds", "Low German Low Saxon");
                c13698lYandex.mo3668catch("nep", "Nepali");
                c13698lYandex.mo3668catch("new", "Newari");
                c13698lYandex.mo3668catch("nia", "Nias");
                c13698lYandex.mo3668catch("nic", "Niger-Kordofanian");
                c13698lYandex.mo3668catch("niu", "Niuean");
                c13698lYandex.mo3668catch("nld", "Dutch");
                c13698lYandex.mo3668catch("nno", "Norwegian Nynorsk");
                c13698lYandex.mo3668catch("nob", "Norwegian Bokmål");
                c13698lYandex.mo3668catch("non", "Norse, Old");
                c13698lYandex.mo3668catch("nor", "Norwegian");
                c13698lYandex.mo3668catch("nso", "Sotho, Northern");
                c13698lYandex.mo3668catch("nub", "Nubian languages");
                c13698lYandex.mo3668catch("nya", "Chichewa Chewa Nyanja");
                c13698lYandex.mo3668catch("nym", "Nyamwezi");
                c13698lYandex.mo3668catch("nyn", "Nyankole");
                c13698lYandex.mo3668catch("nyo", "Nyoro");
                c13698lYandex.mo3668catch("nzi", "Nzima");
                c13698lYandex.mo3668catch("oci", "Occitan (post 1500) Provençal");
                c13698lYandex.mo3668catch("oji", "Ojibwa");
                c13698lYandex.mo3668catch("ori", "Oriya");
                c13698lYandex.mo3668catch("orm", "Oromo");
                c13698lYandex.mo3668catch("osa", "Osage");
                c13698lYandex.mo3668catch("oss", "Ossetian Ossetic");
                c13698lYandex.mo3668catch("ota", "Turkish, Ottoman (1500-1928)");
                c13698lYandex.mo3668catch("oto", "Otomian languages");
                c13698lYandex.mo3668catch("paa", "Papuan");
                c13698lYandex.mo3668catch("pag", "Pangasinan");
                c13698lYandex.mo3668catch("pal", "Pahlavi");
                c13698lYandex.mo3668catch("pam", "Pampanga");
                c13698lYandex.mo3668catch("pan", "Panjabi");
                c13698lYandex.mo3668catch("pap", "Papiamento");
                c13698lYandex.mo3668catch("pau", "Palauan");
                c13698lYandex.mo3668catch("peo", "Persian, Old (ca.600-400 B.C.)");
                c13698lYandex.mo3668catch("per", "Persian");
                c13698lYandex.mo3668catch("phi", "Philippine");
                c13698lYandex.mo3668catch("phn", "Phoenician");
                c13698lYandex.mo3668catch("pli", "Pali");
                c13698lYandex.mo3668catch("pol", "Polish");
                c13698lYandex.mo3668catch("pon", "Pohnpeian");
                c13698lYandex.mo3668catch("por", "Portuguese");
                c13698lYandex.mo3668catch("pra", "Prakrit languages");
                c13698lYandex.mo3668catch("pro", "Provençal, Old (to 1500)");
                c13698lYandex.mo3668catch("pus", "Pushto");
                c13698lYandex.mo3668catch("que", "Quechua");
                c13698lYandex.mo3668catch("raj", "Rajasthani");
                c13698lYandex.mo3668catch("rap", "Rapanui");
                c13698lYandex.mo3668catch("rar", "Rarotongan");
                c13698lYandex.mo3668catch("roa", "Romance");
                c13698lYandex.mo3668catch("roh", "Raeto-Romance");
                c13698lYandex.mo3668catch("rom", "Romany");
                c13698lYandex.mo3668catch("ron", "Romanian");
                c13698lYandex.mo3668catch("rum", "Romanian");
                c13698lYandex.mo3668catch("run", "Rundi");
                c13698lYandex.mo3668catch("rus", "Russian");
                c13698lYandex.mo3668catch("sad", "Sandawe");
                c13698lYandex.mo3668catch("sag", "Sango");
                c13698lYandex.mo3668catch("sah", "Yakut");
                c13698lYandex.mo3668catch("sai", "South American Indian");
                c13698lYandex.mo3668catch("sal", "Salishan languages");
                c13698lYandex.mo3668catch("sam", "Samaritan Aramaic");
                c13698lYandex.mo3668catch("san", "Sanskrit");
                c13698lYandex.mo3668catch("sas", "Sasak");
                c13698lYandex.mo3668catch("sat", "Santali");
                c13698lYandex.mo3668catch("sco", "Scots");
                c13698lYandex.mo3668catch("sel", "Selkup");
                c13698lYandex.mo3668catch("sem", "Semitic");
                c13698lYandex.mo3668catch("sga", "Irish, Old (to 900)");
                c13698lYandex.mo3668catch("sgn", "Sign languages");
                c13698lYandex.mo3668catch("shn", "Shan");
                c13698lYandex.mo3668catch("sid", "Sidamo");
                c13698lYandex.mo3668catch("sin", "Sinhales");
                c13698lYandex.mo3668catch("sio", "Siouan languages");
                c13698lYandex.mo3668catch("sit", "Sino-Tibetan");
                c13698lYandex.mo3668catch("sla", "Slavic");
                c13698lYandex.mo3668catch("slk", "Slovak");
                c13698lYandex.mo3668catch("slo", "Slovak");
                c13698lYandex.mo3668catch("slv", "Slovenian");
                c13698lYandex.mo3668catch("sma", "Southern Sami");
                c13698lYandex.mo3668catch("sme", "Northern Sami");
                c13698lYandex.mo3668catch("smi", "Sami languages");
                c13698lYandex.mo3668catch("smj", "Lule Sami");
                c13698lYandex.mo3668catch("smn", "Inari Sami");
                c13698lYandex.mo3668catch("smo", "Samoan");
                c13698lYandex.mo3668catch("sms", "Skolt Sami");
                c13698lYandex.mo3668catch("sna", "Shona");
                c13698lYandex.mo3668catch("snd", "Sindhi");
                c13698lYandex.mo3668catch("snk", "Soninke");
                c13698lYandex.mo3668catch("sog", "Sogdian");
                c13698lYandex.mo3668catch("som", "Somali");
                c13698lYandex.mo3668catch("son", "Songhai");
                c13698lYandex.mo3668catch("sot", "Sotho, Southern");
                c13698lYandex.mo3668catch("spa", "Spanish Castilia");
                c13698lYandex.mo3668catch("sqi", "Albanian");
                c13698lYandex.mo3668catch("srd", "Sardinian");
                c13698lYandex.mo3668catch("srp", "Serbian");
                c13698lYandex.mo3668catch("srr", "Serer");
                c13698lYandex.mo3668catch("ssa", "Nilo-Saharan");
                c13698lYandex.mo3668catch("sus", "Susu");
                c13698lYandex.mo3668catch("sux", "Sumerian");
                c13698lYandex.mo3668catch("swa", "Swahili");
                c13698lYandex.mo3668catch("swe", "Swedish");
                c13698lYandex.mo3668catch("syr", "Syriac");
                c13698lYandex.mo3668catch("tah", "Tahitian");
                c13698lYandex.mo3668catch("tai", "Tai");
                c13698lYandex.mo3668catch("tam", "Tamil");
                c13698lYandex.mo3668catch("tat", "Tatar");
                c13698lYandex.mo3668catch("tel", "Telugu");
                c13698lYandex.mo3668catch("tem", "Timne");
                c13698lYandex.mo3668catch("ter", "Tereno");
                c13698lYandex.mo3668catch("tet", "Tetum");
                c13698lYandex.mo3668catch("tgk", "Tajik");
                c13698lYandex.mo3668catch("tgl", "Tagalog");
                c13698lYandex.mo3668catch("tha", "Thai");
                c13698lYandex.mo3668catch("tib", "Tibetan");
                c13698lYandex.mo3668catch("tig", "Tigre");
                c13698lYandex.mo3668catch("tir", "Tigrinya");
                c13698lYandex.mo3668catch("tiv", "Tiv");
                c13698lYandex.mo3668catch("tkl", "Tokelau");
                c13698lYandex.mo3668catch("tli", "Tlingit");
                c13698lYandex.mo3668catch("tmh", "Tamashek");
                c13698lYandex.mo3668catch("tog", "Tonga (Nyasa)");
                c13698lYandex.mo3668catch("ton", "Tonga (Tonga Islands)");
                c13698lYandex.mo3668catch("tpi", "Tok Pisin");
                c13698lYandex.mo3668catch("tsi", "Tsimshian");
                c13698lYandex.mo3668catch("tsn", "Tswana");
                c13698lYandex.mo3668catch("tso", "Tsonga");
                c13698lYandex.mo3668catch("tuk", "Turkmen");
                c13698lYandex.mo3668catch("tum", "Tumbuka");
                c13698lYandex.mo3668catch("tup", "Tupi");
                c13698lYandex.mo3668catch("tur", "Turkish");
                c13698lYandex.mo3668catch("tut", "Altaic");
                c13698lYandex.mo3668catch("tvl", "Tuvalu");
                c13698lYandex.mo3668catch("twi", "Twi");
                c13698lYandex.mo3668catch("tyv", "Tuvinian");
                c13698lYandex.mo3668catch("uga", "Ugaritic");
                c13698lYandex.mo3668catch("uig", "Uighur");
                c13698lYandex.mo3668catch("ukr", "Ukrainian");
                c13698lYandex.mo3668catch("umb", "Umbundu");
                c13698lYandex.mo3668catch("und", "Undetermined");
                c13698lYandex.mo3668catch("urd", "Urdu");
                c13698lYandex.mo3668catch("uzb", "Uzbek");
                c13698lYandex.mo3668catch("vai", "Vai");
                c13698lYandex.mo3668catch("ven", "Venda");
                c13698lYandex.mo3668catch("vie", "Vietnamese");
                c13698lYandex.mo3668catch("vol", "Volapük");
                c13698lYandex.mo3668catch("vot", "Votic");
                c13698lYandex.mo3668catch("wak", "Wakashan languages");
                c13698lYandex.mo3668catch("wal", "Walamo");
                c13698lYandex.mo3668catch("war", "Waray");
                c13698lYandex.mo3668catch("was", "Washo");
                c13698lYandex.mo3668catch("wel", "Welsh");
                c13698lYandex.mo3668catch("wen", "Sorbian languages");
                c13698lYandex.mo3668catch("wln", "Walloon");
                c13698lYandex.mo3668catch("wol", "Wolof");
                c13698lYandex.mo3668catch("xho", "Xhosa");
                c13698lYandex.mo3668catch("yao", "Yao");
                c13698lYandex.mo3668catch("yap", "Yapese");
                c13698lYandex.mo3668catch("yid", "Yiddish");
                c13698lYandex.mo3668catch("yor", "Yoruba");
                c13698lYandex.mo3668catch("ypk", "Yupik languages");
                c13698lYandex.mo3668catch("zap", "Zapotec");
                c13698lYandex.mo3668catch("zen", "Zenaga");
                c13698lYandex.mo3668catch("zha", "Zhuang Chuang");
                c13698lYandex.mo3668catch("zho", "Chinese");
                c13698lYandex.mo3668catch("znd", "Zande");
                c13698lYandex.mo3668catch("zul", "Zulu");
                c13698lYandex.mo3668catch("zun", "Zuni");
                c13698lYandex.mo3668catch("\u0000\u0000\u0000", "Winamp Format");
                c13698lYandex.mo3668catch("XXX", "Media Monkey Format");
                this.f25776l = c13698lYandex.metrica(true);
                break;
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static String m3574case(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static void m3575native(C13161l c13161l, InterfaceC9576l interfaceC9576l) {
        if (((InterfaceC9576l) c13161l.f25776l) == null) {
            c13161l.f25776l = interfaceC9576l;
        } else {
            C18073l.admob();
        }
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static void m3576static(String str, C4299l c4299l) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(c4299l.loadAd / 1000000)));
        sb.append(": logging error [");
        AbstractC6082l abstractC6082l = c4299l.amazon;
        if (abstractC6082l == null) {
            C8339l.smaato("cannot request log site information prior to postProcess()");
            return;
        }
        AbstractC5573l.Signature(1, abstractC6082l, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public static C13161l subs() {
        if (f25775l == null) {
            synchronized (C13161l.class) {
                try {
                    if (f25775l == null) {
                        f25775l = new C13161l(0, false);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25775l;
    }

    public static boolean tapsense(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void Signature(C16053l c16053l) {
        if (c16053l.loadAd) {
            return;
        }
        C9598l c9598l = (C9598l) this.f25776l;
        synchronized (((ArrayList) c9598l.f19552l)) {
            ((ArrayList) c9598l.f19552l).remove(c16053l);
        }
    }

    public void ad() {
        m3588volatile("android.support.v4.media.session.action.PREPARE", null);
    }

    public String adcel(String str) {
        Bundle bundle = (Bundle) this.f25776l;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void admob(int i, int i2) {
        RunnableC15098l runnableC15098l = (RunnableC15098l) this.f25776l;
        Object obj = ((List) runnableC15098l.f29629l).get(i);
        Object obj2 = ((List) runnableC15098l.f29633l).get(i2);
        if (obj == null || obj2 == null) {
            C11586l.yandex();
        } else {
            Object obj3 = ((C12552l) runnableC15098l.f29632l).loadAd.f20418l;
        }
    }

    @Override // defpackage.InterfaceC6684l
    public C10227l ads() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AudioPlaylist audioPlaylist = (AudioPlaylist) this.f25776l;
        c10227lAdmob.add(new C12885l(audioPlaylist.mopub, 1, AbstractC14770l.vip(audioPlaylist)));
        for (MainArtist mainArtist : audioPlaylist.isVip) {
            String str = mainArtist.crashlytics;
            String str2 = mainArtist.yandex;
            if (str2 != null) {
                c10227lAdmob.add(new C12885l(str, 4, str2));
            }
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    public void advert(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3588volatile("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
    }

    @Override // defpackage.InterfaceC14606l
    public /* bridge */ /* synthetic */ void amazon(Object obj) {
    }

    public void applovin(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3588volatile("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    @Override // defpackage.InterfaceC16334l
    public Object appmetrica(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((InterfaceC2165l) this.f25776l).loadAd(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public boolean billing(String str) {
        String strAdcel = adcel(str);
        return "1".equals(strAdcel) || Boolean.parseBoolean(strAdcel);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public C10771l m3577catch(C0350l c0350l) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25776l;
        Object c10771l = linkedHashMap.get(c0350l);
        if (c10771l == null) {
            c10771l = new C10771l(c0350l);
            linkedHashMap.put(c0350l, c10771l);
        }
        return (C10771l) c10771l;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m3578class(int i) {
        while (true) {
            int i2 = i & (-128);
            InterfaceC16805l interfaceC16805l = (InterfaceC16805l) this.f25776l;
            if (i2 == 0) {
                interfaceC16805l.writeByte(i);
                return;
            } else {
                interfaceC16805l.writeByte((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m3579continue(int i, Object obj, InterfaceC9608l interfaceC9608l) {
        AbstractC11078l abstractC11078l = (AbstractC11078l) this.f25776l;
        abstractC11078l.Signature(i, 3);
        interfaceC9608l.billing(abstractC11078l.yandex, (AbstractC9446l) obj);
        abstractC11078l.Signature(i, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable crashlytics(AbstractC0283l abstractC0283l) {
        C15141l c15141l;
        List list;
        if (abstractC0283l instanceof C15141l) {
            c15141l = (C15141l) abstractC0283l;
            int i = c15141l.f29690l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15141l.f29690l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15141l = new C15141l(this, abstractC0283l);
            }
        } else {
            c15141l = new C15141l(this, abstractC0283l);
        }
        Object obj = c15141l.f29691l;
        int i2 = c15141l.f29690l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            List listRemoteconfig = AbstractC14055l.remoteconfig(C11488l.yandex, C2836l.crashlytics, C2836l.amazon);
            c15141l.f29692l = listRemoteconfig;
            c15141l.f29690l = 1;
            Serializable serializablePurchase = purchase(c15141l);
            Serializable serializable = EnumC9342l.f19165l;
            if (serializablePurchase == serializable) {
                return serializable;
            }
            obj = serializablePurchase;
            list = listRemoteconfig;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = c15141l.f29692l;
            AbstractC2829l.crashlytics(obj);
        }
        return AbstractC16901l.m4232new(list, (Iterable) obj);
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        return ((C3268l) this.f25776l).amazon(bArr, 0);
    }

    @Override // defpackage.InterfaceC4041l
    /* JADX INFO: renamed from: else */
    public void mo1470else(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f25776l;
        if (jArr2 == null) {
            this.f25776l = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1])) == 0) {
                return;
            }
        }
        long[] jArr4 = ((long[][]) this.f25776l)[1];
        jArr4[0] = jArr[0];
        jArr4[1] = jArr[1];
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr5 = (long[][]) this.f25776l;
            long[] jArr6 = jArr5[i >> 1];
            long[] jArr7 = jArr5[i];
            long j = jArr6[0];
            long j2 = jArr6[1];
            long j3 = ((j2 >> 63) & 135) ^ (j << 1);
            jArr7[0] = j3;
            long j4 = (j >>> 63) | (j2 << 1);
            jArr7[1] = j4;
            long[] jArr8 = jArr5[1];
            long[] jArr9 = jArr5[i + 1];
            jArr9[0] = jArr8[0] ^ j3;
            jArr9[1] = j4 ^ jArr8[1];
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m3580extends(defpackage.C5978l r5) {
        /*
            r4 = this;
            java.lang.String r4 = r5.metrica
            r0 = 0
            if (r4 == 0) goto L86
            boolean r4 = defpackage.AbstractC3825l.firebase(r4)
            if (r4 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r4 = r5.metrica
            java.lang.String r5 = defpackage.AbstractC15323l.yandex
            r4.getClass()
            int r5 = r4.hashCode()
            r1 = 4
            r2 = 1
            r3 = -1
            switch(r5) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r5 = "image/png"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28
            goto L6b
        L28:
            r3 = 6
            goto L6b
        L2a:
            java.lang.String r5 = "image/bmp"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L33
            goto L6b
        L33:
            r3 = 5
            goto L6b
        L35:
            java.lang.String r5 = "image/webp"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
            goto L6b
        L3e:
            r3 = r1
            goto L6b
        L40:
            java.lang.String r5 = "image/jpeg"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L49
            goto L6b
        L49:
            r3 = 3
            goto L6b
        L4b:
            java.lang.String r5 = "image/heif"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L54
            goto L6b
        L54:
            r3 = 2
            goto L6b
        L56:
            java.lang.String r5 = "image/heic"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L5f
            goto L6b
        L5f:
            r3 = r2
            goto L6b
        L61:
            java.lang.String r5 = "image/avif"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L6a
            goto L6b
        L6a:
            r3 = r0
        L6b:
            switch(r3) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r4 < r5) goto L81
            goto L7c
        L76:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r4 < r5) goto L81
        L7c:
            int r4 = defpackage.AbstractC4338l.ads(r1, r0, r0, r0)
            return r4
        L81:
            int r4 = defpackage.AbstractC4338l.ads(r2, r0, r0, r0)
            return r4
        L86:
            int r4 = defpackage.AbstractC4338l.ads(r0, r0, r0, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13161l.m3580extends(lؘۜٔ):int");
    }

    public Integer firebase(String str) {
        String strAdcel = adcel(str);
        if (TextUtils.isEmpty(strAdcel)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strAdcel));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m3574case(str) + "(" + strAdcel + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m3581for(byte[] bArr) {
        int i = 0;
        while (true) {
            C14965l[] c14965lArr = (C14965l[]) this.f25776l;
            if (i >= c14965lArr.length) {
                return;
            }
            int i2 = i * 384;
            short[] sArr = (short[]) c14965lArr[i].f29441l;
            for (int i3 = 0; i3 < 256; i3++) {
                short s = (short) (sArr[i3] - 3329);
                sArr[i3] = (short) (s + ((s >> 15) & 3329));
            }
            for (int i4 = 0; i4 < 128; i4++) {
                int i5 = i4 * 2;
                short s2 = sArr[i5];
                short s3 = sArr[i5 + 1];
                int i6 = (i4 * 3) + i2;
                bArr[i6] = (byte) s2;
                bArr[i6 + 1] = (byte) ((s2 >> 8) | (s3 << 4));
                bArr[i6 + 2] = (byte) (s3 >> 4);
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        InterfaceC9576l interfaceC9576l = (InterfaceC9576l) this.f25776l;
        if (interfaceC9576l != null) {
            return interfaceC9576l.get();
        }
        C18073l.admob();
        return null;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("Skein-MAC-");
        C3268l c3268l = (C3268l) this.f25776l;
        sb.append(c3268l.f6996l.f4012l * 8);
        sb.append("-");
        sb.append(c3268l.f6995l * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return ((C3268l) this.f25776l).f6995l;
    }

    @Override // defpackage.InterfaceC1771l
    public String getValue(String str) {
        return (String) ((C15333l) this.f25776l).get(str);
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        C17212l c17212l = c1473l.yandex;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f25776l;
        if (!Objects.equals(coordinatorLayout.f378l, c1473l)) {
            coordinatorLayout.f378l = c1473l;
            boolean z = c1473l.amazon() > 0;
            coordinatorLayout.f371l = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!c17212l.subscription()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    if (childAt.getFitsSystemWindows() && ((C0637l) childAt.getLayoutParams()).yandex != null && c17212l.subscription()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c1473l;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C16706l c16706l;
        if (interfaceC9719l instanceof C16706l) {
            c16706l = (C16706l) interfaceC9719l;
        } else {
            if (!(interfaceC9719l instanceof C13886l)) {
                C8339l.metrica(AbstractC5020l.subscription("Invalid parameter passed to Skein MAC init - ", interfaceC9719l));
                return;
            }
            Hashtable hashtable = new Hashtable();
            byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
            if (bArr == null) {
                C8339l.metrica("Parameter value must not be null.");
                return;
            } else {
                hashtable.put(0, bArr);
                c16706l = new C16706l();
                c16706l.f32727l = hashtable;
            }
        }
        if (((byte[]) c16706l.f32727l.get(0)) != null) {
            ((C3268l) this.f25776l).purchase(c16706l);
        } else {
            C8339l.metrica("Skein MAC requires a key parameter.");
        }
    }

    public C10771l inmobi(C0350l c0350l) {
        return (C10771l) ((LinkedHashMap) this.f25776l).remove(c0350l);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m3582interface(long j) {
        while (true) {
            long j2 = (-128) & j;
            InterfaceC16805l interfaceC16805l = (InterfaceC16805l) this.f25776l;
            if (j2 == 0) {
                interfaceC16805l.writeByte((int) j);
                return;
            } else {
                interfaceC16805l.writeByte((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // defpackage.InterfaceC18517l
    public void isPro(Object obj) {
        C6597l c6597l = (C6597l) obj;
        C13734l c13734l = (C13734l) this.f25776l;
        C17624l c17624l = (C17624l) c13734l.f26814throws.pollLast();
        if (c17624l == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = c17624l.f34294l;
        int i = c17624l.f34293l;
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lM2861super = c13734l.crashlytics.m2861super(str);
        if (abstractComponentCallbacksC4411lM2861super != null) {
            abstractComponentCallbacksC4411lM2861super.startapp(i, c6597l.f13816l, c6597l.f13815l);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.InterfaceC4041l
    public void isVip(long[] jArr) {
        long[] jArr2 = ((long[][]) this.f25776l)[((int) (jArr[1] >>> 56)) & 255];
        long[] jArr3 = {jArr2[0], jArr2[1]};
        for (int i = 14; i >= 0; i--) {
            long j = jArr3[0];
            long j2 = jArr3[1];
            long j3 = j2 >>> 56;
            long j4 = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
            jArr3[0] = j4;
            long j5 = (j >>> 56) | (j2 << 8);
            jArr3[1] = j5;
            long[] jArr4 = ((long[][]) this.f25776l)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255];
            jArr3[0] = jArr4[0] ^ j4;
            jArr3[1] = j5 ^ jArr4[1];
        }
        jArr[0] = jArr3[0];
        jArr[1] = jArr3[1];
    }

    public Bundle license() {
        Bundle bundle = (Bundle) this.f25776l;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public boolean loadAd(int i, int i2) {
        RunnableC15098l runnableC15098l = (RunnableC15098l) this.f25776l;
        Object obj = ((List) runnableC15098l.f29629l).get(i);
        Object obj2 = ((List) runnableC15098l.f29633l).get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Object obj3 = ((C12552l) runnableC15098l.f29632l).loadAd.f20418l;
        return AbstractC8576l.yandex(obj instanceof InterfaceC12360l ? ((InterfaceC12360l) obj).getYandex() : String.valueOf(obj.hashCode()), obj2 instanceof InterfaceC12360l ? ((InterfaceC12360l) obj2).getYandex() : String.valueOf(obj2.hashCode()));
    }

    public String metrica(Resources resources, String str, String str2) {
        String[] strArr;
        String strAdcel = adcel(str2);
        if (!TextUtils.isEmpty(strAdcel)) {
            return strAdcel;
        }
        String strAdcel2 = adcel(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strAdcel2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strAdcel2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m3574case(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArraySmaato = smaato(str2.concat("_loc_args"));
        if (jSONArraySmaato == null) {
            strArr = null;
        } else {
            int length = jSONArraySmaato.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArraySmaato.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m3574case(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) throws Exception {
        ((C1282l) this.f25776l).close();
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C4816l c4816l = (C4816l) this.f25776l;
        int i = AbstractC9795l.yandex;
        c4816l.mopub(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        if (r11 == r7) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00f6 -> B:58:0x00f9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m3583package(defpackage.AbstractC18643l r9, defpackage.EnumC12999l r10, defpackage.AbstractC0283l r11) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13161l.m3583package(lۡۨ, lّۦٟ, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC17475l
    public void premium(char c) {
        AbstractC17291l.admob((C18476l) this.f25776l, c);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void mo3584private(float f) {
        if (f == 0.0f) {
            C8339l.metrica("speed must not be zero");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        m3588volatile("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }

    public void pro() {
        int i = 0;
        while (true) {
            C14965l[] c14965lArr = (C14965l[]) this.f25776l;
            if (i >= c14965lArr.length) {
                return;
            }
            C14965l c14965l = c14965lArr[i];
            short[] sArr = (short[]) c14965l.f29441l;
            int i2 = 1;
            for (int i3 = 128; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = AbstractC15929l.yandex[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        short s2 = sArr[i6];
                        int i7 = i6 + i3;
                        short sBilling = AbstractC10409l.billing(sArr[i7] * s);
                        sArr[i7] = (short) (s2 - sBilling);
                        sArr[i6] = (short) (s2 + sBilling);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            c14965l.smaato();
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable purchase(AbstractC0283l abstractC0283l) {
        C7964l c7964l;
        if (abstractC0283l instanceof C7964l) {
            c7964l = (C7964l) abstractC0283l;
            int i = c7964l.f16605l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7964l.f16605l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7964l = new C7964l(this, abstractC0283l);
            }
        } else {
            c7964l = new C7964l(this, abstractC0283l);
        }
        Object objFirebase = c7964l.f16604l;
        int i2 = c7964l.f16605l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3603l).yandex();
            c7964l.f16605l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c7964l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        List list = ((C7814l) objFirebase).f16331l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C18233l) obj).f35743l) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((C18233l) it.next()).f35744l.ordinal();
            if (iOrdinal == 0) {
                c10227lAdmob.add(C2836l.purchase);
            } else if (iOrdinal == 1) {
                c10227lAdmob.add(C2836l.loadAd);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return null;
                }
                if (((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
                    c10227lAdmob.add(C1279l.yandex);
                }
            } else if (((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
                c10227lAdmob.add(C13475l.yandex);
            }
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.InterfaceC15838l
    public Object remoteconfig(InterfaceC1555l interfaceC1555l, Float f, Float f2, Function1 function1, C13597l c13597l) {
        Object objLoadAd = AbstractC12811l.loadAd(interfaceC1555l, f.floatValue(), AbstractC15042l.yandex(0.0f, f2.floatValue(), 28), (C17308l) this.f25776l, function1, c13597l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : (C16483l) objLoadAd;
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        C3268l c3268l = (C3268l) this.f25776l;
        long[] jArr = c3268l.f6998l;
        long[] jArr2 = c3268l.f6992l;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        c3268l.subs(48);
    }

    public void signatures(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        m3588volatile("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    public JSONArray smaato(String str) {
        String strAdcel = adcel(str);
        if (TextUtils.isEmpty(strAdcel)) {
            return null;
        }
        try {
            return new JSONArray(strAdcel);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m3574case(str) + ": " + strAdcel + ", falling back to default");
            return null;
        }
    }

    public C14256l startapp(C16958l c16958l) {
        long jSubs;
        C1644l c1644l = (C1644l) this.f25776l;
        float f = c16958l.yandex;
        float f2 = c16958l.loadAd;
        int iOrdinal = vip().ordinal();
        if (iOrdinal == 0) {
            jSubs = c1644l.subs() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return null;
            }
            jSubs = c1644l.subs() >> 32;
        }
        return new C14256l(f, ((int) jSubs) - f2);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public ArrayList m3585strictfp(int i) {
        ArrayList arrayList = new ArrayList();
        C8232l c8232l = (C8232l) this.f25776l;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C13217l c13217l = c8232l.loadAd ? c8232l.crashlytics : (C13217l) c8232l.purchase.getValue();
            if (c13217l != null) {
                C9987l c9987l = new C9987l();
                c9987l.f20387l = 1;
                List list = (List) c13217l.firebase.invoke(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C8195l c8195l = (C8195l) list.get(i2);
                    C14541l c14541l = c8232l.metrica;
                    int iIntValue = ((Number) c8195l.f17098l).intValue();
                    long j = ((C15519l) c8195l.f17097l).yandex;
                    C13645l c13645l = C8232l.pro;
                    c9987l = c9987l;
                    arrayList.add(c14541l.yandex(iIntValue, j, false, new C17796l((ArrayList) null, c9987l, list, i, c13217l)));
                }
                Unit unit = Unit.INSTANCE;
            }
            return arrayList;
        } finally {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
        }
    }

    public ArrayList subscription() {
        List list = ((C1644l) this.f25776l).firebase;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5371l((C15237l) it.next(), vip()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m3586switch(C3844l c3844l) {
        ((InterfaceC16805l) this.f25776l).appmetrica(c3844l);
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: synchronized */
    public void mo1722synchronized(String str) {
        C18476l c18476l = (C18476l) this.f25776l;
        AbstractC17291l.admob(c18476l, 34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = AbstractC4216l.yandex;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                AbstractC17291l.subs(c18476l, str, i, i2);
                String str2 = strArr[cCharAt];
                AbstractC17291l.subs(c18476l, str2, 0, str2.length());
                i = i2 + 1;
            }
        }
        AbstractC17291l.subs(c18476l, str, i, str.length());
        AbstractC17291l.admob(c18476l, 34);
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: throw */
    public void mo1723throw(String str) {
        AbstractC17291l.subs((C18476l) this.f25776l, str, 0, str.length());
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public List m3587throws(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25776l;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (AbstractC8576l.yandex(((C0350l) entry.getKey()).yandex, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((C0350l) it.next());
        }
        return AbstractC16901l.m4213const(linkedHashMap2.values());
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        C3268l c3268l = (C3268l) this.f25776l;
        byte[] bArr = c3268l.f6999l;
        bArr[0] = b;
        C9598l c9598l = c3268l.f6994l;
        if (c9598l != null) {
            c9598l.m2696catch(bArr, 0, 1, c3268l.f6992l);
        } else {
            C8339l.metrica("Skein engine is not initialised.");
        }
    }

    public EnumC7283l vip() {
        return ((C1644l) this.f25776l).metrica;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m3588volatile(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            C8339l.metrica(AbstractC15560l.Signature("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        } else {
            ((MediaController.TransportControls) this.f25776l).sendCustomAction(str, bundle);
        }
    }

    @Override // defpackage.InterfaceC17475l
    public void writeLong(long j) {
        C18476l c18476l = (C18476l) this.f25776l;
        byte[] bArr = AbstractC7777l.yandex;
        if (j == 0) {
            c18476l.m4562synchronized((byte) 48);
            return;
        }
        int i = 0;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                AbstractC17291l.subs(c18476l, "-9223372036854775808", 0, 20);
                return;
            }
            i = 1;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i2 = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i2 = 2;
                }
            } else if (j < 1000000) {
                i2 = j < 100000 ? 5 : 6;
            } else {
                i2 = j < 10000000 ? 7 : 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i2 = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else {
                i2 = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i2 = j < 10000000000000000L ? 16 : 17;
        } else {
            i2 = j < 1000000000000000000L ? 18 : 19;
        }
        if (i != 0) {
            i2++;
        }
        C2139l c2139lInmobi = c18476l.inmobi(i2);
        byte[] bArr2 = c2139lInmobi.yandex;
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                bArr2[c2139lInmobi.crashlytics + i3] = AbstractC7777l.yandex[(byte) (j % 10)];
                j /= 10;
                if (i3 == i) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        if (i != 0) {
            bArr2[c2139lInmobi.crashlytics] = 45;
        }
        c2139lInmobi.crashlytics += i2;
        c18476l.f36079l += (long) i2;
    }

    public boolean yandex(int i, int i2) {
        RunnableC15098l runnableC15098l = (RunnableC15098l) this.f25776l;
        Object obj = ((List) runnableC15098l.f29629l).get(i);
        Object obj2 = ((List) runnableC15098l.f29633l).get(i2);
        if (obj != null && obj2 != null) {
            Object obj3 = ((C12552l) runnableC15098l.f29632l).loadAd.f20418l;
            return obj.equals(obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        C11586l.yandex();
        return false;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        C3268l c3268l = (C3268l) this.f25776l;
        C9598l c9598l = c3268l.f6994l;
        if (c9598l != null) {
            c9598l.m2696catch(bArr, i, i2, c3268l.f6992l);
        } else {
            C8339l.metrica("Skein engine is not initialised.");
        }
    }

    public C13161l(int i, int i2) {
        this.f25776l = new C3268l(i, i2);
    }

    public /* synthetic */ C13161l(Object obj) {
        this.f25776l = obj;
    }

    public C13161l(int i) {
        this.f25776l = new C14965l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C14965l[]) this.f25776l)[i2] = new C14965l(18);
        }
    }
}
