package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؓٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1833l extends AbstractC15422l {
    public static String firebase(String str) throws IOException {
        int length;
        Comparable comparable;
        List listM3316class = AbstractC12024l.m3316class(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3316class) {
            if (!AbstractC12024l.m3315catch((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC8576l.remoteconfig(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM3316class.size();
        int iSmaato = AbstractC14055l.smaato(listM3316class);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM3316class) {
            int i = length + 1;
            if (length < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            String str3 = (String) obj2;
            String strM3347throws = ((length == 0 || length == iSmaato) && AbstractC12024l.m3315catch(str3)) ? null : AbstractC12024l.m3347throws(iIntValue, str3);
            if (strM3347throws != null) {
                arrayList3.add(strM3347throws);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC16901l.m4216else(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String smaato(String str) throws IOException {
        if (AbstractC12024l.m3315catch("|")) {
            C8339l.metrica("marginPrefix must be non-blank string.");
            return null;
        }
        List listM3316class = AbstractC12024l.m3316class(str);
        int length = str.length();
        listM3316class.size();
        int iSmaato = AbstractC14055l.smaato(listM3316class);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM3316class) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == iSmaato) && AbstractC12024l.m3315catch(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC8576l.remoteconfig(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC16901l.m4216else(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String subs(String str, String str2) {
        return AbstractC17587l.vip(new C11100l(new C17798l(6, str), new C6908l(str2, 19)), "\n");
    }
}
