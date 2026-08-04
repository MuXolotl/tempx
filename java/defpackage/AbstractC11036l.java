package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11036l {
    public static final C15578l yandex = new C15578l(1892533350, false, new C7614l(4));
    public static final C15578l loadAd = new C15578l(1456681893, false, new C7614l(5));
    public static final C15578l crashlytics = new C15578l(308808284, false, new C7614l(6));
    public static final C15578l amazon = new C15578l(-2083261985, false, new C7614l(7));
    public static final C15578l purchase = new C15578l(2007927123, false, new C7614l(8));
    public static final C15578l billing = new C15578l(-1416886733, false, new C10721l(7));
    public static final C15578l mopub = new C15578l(-353924903, false, new C10721l(8));
    public static final C15578l admob = new C15578l(816797503, false, new C7614l(9));

    public static final void admob(C13056l c13056l, String str) {
        List arrayList;
        if (AbstractC12024l.m3315catch(str)) {
            arrayList = C2580l.f5619l;
        } else {
            arrayList = str.equals("/") ? AbstractC10701l.yandex : new ArrayList(AbstractC12024l.m3323finally(str, new char[]{'/'}));
        }
        c13056l.admob = arrayList;
    }

    public static final C5254l amazon(InterfaceC18419l interfaceC18419l) {
        String strM217l = interfaceC18419l.yandex().m217l("Content-Type");
        if (strM217l == null) {
            return null;
        }
        C5254l c5254l = C5254l.f11335l;
        return AbstractC10033l.admob(strM217l);
    }

    public static final String billing(C13056l c13056l) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = c13056l.purchase;
        String str2 = c13056l.billing;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(c13056l.yandex);
        int i = c13056l.crashlytics;
        if (i != 0 && i != c13056l.amazon().f33555l) {
            sb.append(":");
            sb.append(String.valueOf(c13056l.crashlytics));
        }
        return sb.toString();
    }

    public static final Long crashlytics(InterfaceC13536l interfaceC13536l) {
        String strSignatures = interfaceC13536l.yandex().signatures("Content-Length");
        if (strSignatures != null) {
            return AbstractC16648l.premium(strSignatures);
        }
        return null;
    }

    public static final void isPro(int i, int i2, InterfaceC18035l interfaceC18035l) {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC18035l.admob(i4));
            }
            i3 >>>= 1;
        }
        throw new C9088l(interfaceC18035l.yandex(), arrayList);
    }

    public static void loadAd(C13056l c13056l, String[] strArr) {
        boolean z;
        ArrayList arrayListM4232new;
        List listM2415super = AbstractC8669l.m2415super(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM2415super.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else {
                AbstractC3984l.license(arrayList, AbstractC12024l.m3323finally((String) it.next(), new char[]{'/'}));
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AbstractC2208l.billing((String) it2.next()));
        }
        boolean z2 = c13056l.admob.size() > 1 && ((CharSequence) AbstractC16901l.m4214continue(c13056l.admob)).length() == 0 && !arrayList2.isEmpty();
        if (arrayList2.size() > 1 && ((CharSequence) AbstractC16901l.m4231native(arrayList2)).length() == 0 && !c13056l.admob.isEmpty()) {
            z = true;
        }
        if (z2 && z) {
            arrayListM4232new = AbstractC16901l.m4232new(AbstractC16901l.m4242synchronized(1, c13056l.admob), AbstractC16901l.m4233package(1, arrayList2));
        } else {
            List list = c13056l.admob;
            if (z2) {
                arrayListM4232new = AbstractC16901l.m4232new(AbstractC16901l.m4242synchronized(1, list), arrayList2);
            } else {
                arrayListM4232new = z ? AbstractC16901l.m4232new(list, AbstractC16901l.m4233package(1, arrayList2)) : AbstractC16901l.m4232new(list, arrayList2);
            }
        }
        c13056l.admob = arrayListM4232new;
    }

    public static final String mopub(C13056l c13056l) {
        List list = c13056l.admob;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) AbstractC16901l.m4231native(list)).length() == 0 ? "/" : (String) AbstractC16901l.m4231native(list);
        }
        return AbstractC16901l.m4210case(list, "/", null, null, null, 62);
    }

    public static void purchase(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static final void subs(int[] iArr, int[] iArr2, InterfaceC18035l interfaceC18035l) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(interfaceC18035l.admob((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new C9088l(interfaceC18035l.yandex(), arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void yandex(C13056l c13056l, StringBuilder sb) throws IOException {
        List listSingletonList;
        sb.append(c13056l.amazon().f33556l);
        String str = c13056l.amazon().f33556l;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = c13056l.purchase;
                    String str3 = c13056l.billing;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append("@");
                    }
                    CharSequence string = sb2.toString();
                    CharSequence charSequence = c13056l.yandex;
                    sb.append(":");
                    sb.append(string);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = c13056l.yandex;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = c13056l.yandex;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = c13056l.yandex;
                    String strMopub = mopub(c13056l);
                    sb.append("://");
                    sb.append(charSequence4);
                    if (!AbstractC12024l.m3349try(strMopub, '/')) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) strMopub);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = c13056l.yandex;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(billing(c13056l));
        String strMopub2 = mopub(c13056l);
        InterfaceC0112l interfaceC0112l = c13056l.subs;
        boolean z = c13056l.loadAd;
        if (!AbstractC12024l.m3315catch(strMopub2) && !AbstractC16648l.isVip(strMopub2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strMopub2);
        if (!interfaceC0112l.isEmpty() || z) {
            sb.append("?");
        }
        Set<Map.Entry> setMopub = interfaceC0112l.mopub();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setMopub) {
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listSingletonList = Collections.singletonList(new C8195l(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C8195l(str4, (String) it.next()));
                }
                listSingletonList = arrayList2;
            }
            AbstractC3984l.license(arrayList, listSingletonList);
        }
        AbstractC16901l.m4216else(arrayList, sb, "&", null, null, new C12176l(2), 60);
        if (c13056l.mopub.length() > 0) {
            sb.append('#');
            sb.append(c13056l.mopub);
        }
    }
}
