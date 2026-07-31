package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lُٞۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11214l {
    public static final LinkedHashMap loadAd;
    public static final String yandex = AbstractC16901l.m4210case(AbstractC14055l.remoteconfig('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listRemoteconfig = AbstractC14055l.remoteconfig("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iAmazon = AbstractC17764l.amazon(0, listRemoteconfig.size() - 1, 2);
        if (iAmazon >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = yandex;
                sb.append(str);
                sb.append('/');
                sb.append((String) listRemoteconfig.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listRemoteconfig.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC0653l.ads(sb2, (String) listRemoteconfig.get(i), "Array"), "[" + ((String) listRemoteconfig.get(i2)));
                if (i == iAmazon) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(yandex + "/Unit", "V");
        yandex(linkedHashMap, "Any", "java/lang/Object");
        yandex(linkedHashMap, "Nothing", "java/lang/Void");
        yandex(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC14055l.remoteconfig("String", "CharSequence", "Throwable", "Cloneable", DataTypes.OBJ_NUMBER, "Comparable", "Enum")) {
            yandex(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC14055l.remoteconfig("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            yandex(linkedHashMap, AbstractC14814l.startapp("collections/", str3), "java/util/" + str3);
            yandex(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        yandex(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        yandex(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        yandex(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        yandex(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strVip = AbstractC0653l.vip(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = yandex;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            yandex(linkedHashMap, strVip, sb3.toString());
            yandex(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC14055l.remoteconfig("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            yandex(linkedHashMap, AbstractC12900l.firebase(str5, ".Companion"), AbstractC9361l.advert(new StringBuilder(), yandex, "/jvm/internal/", str5, "CompanionObject"));
        }
        loadAd = linkedHashMap;
    }

    public static final String loadAd(String str) {
        String str2 = (String) loadAd.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + str.replace('.', '$') + ';';
    }

    public static final void yandex(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(yandex + '/' + str, "L" + str2 + ';');
    }
}
