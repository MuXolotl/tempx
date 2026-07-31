package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؓؔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1577l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f3897l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f3898l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3899l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Serializable f3900l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f3901l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f3902l;

    public C1577l(InterfaceC15879l interfaceC15879l, Size size) {
        Rational rational;
        this.f3899l = 5;
        this.f3901l = interfaceC15879l;
        this.f3898l = interfaceC15879l.crashlytics();
        this.f3897l = interfaceC15879l.metrica();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listAppmetrica = interfaceC15879l.appmetrica(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            if (listAppmetrica.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listAppmetrica, new C16027l(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f3900l = rational;
        C4643l c4643l = new C4643l();
        c4643l.yandex = interfaceC15879l.crashlytics();
        c4643l.loadAd = interfaceC15879l.metrica();
        c4643l.amazon = rational;
        c4643l.crashlytics = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.f3902l = c4643l;
    }

    public static HashMap isPro(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = mopub(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (AbstractC14608l.yandex(size, rational, AbstractC5513l.crashlytics)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static ArrayList mopub(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(AbstractC14608l.yandex);
        arrayList2.add(AbstractC14608l.crashlytics);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                } while (!AbstractC14608l.yandex(size, (Rational) it2.next(), AbstractC5513l.crashlytics));
            }
        }
        return arrayList2;
    }

    public static String purchase(C14184l c14184l) {
        c14184l.yandex();
        C1042l c1042l = c14184l.crashlytics;
        String str = c1042l.purchase;
        if (str != null) {
            return str;
        }
        c14184l.yandex();
        String str2 = c1042l.loadAd;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static void remoteconfig(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static Rational subs(int i, boolean z) {
        if (i == -1 || i == 0) {
            return z ? AbstractC14608l.yandex : AbstractC14608l.loadAd;
        }
        if (i == 1) {
            return z ? AbstractC14608l.crashlytics : AbstractC14608l.amazon;
        }
        AbstractC5088l.crashlytics("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static void vip(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    public List admob(InterfaceC0048l interfaceC0048l) {
        Size[] sizeArr;
        InterfaceC15879l interfaceC15879l = (InterfaceC15879l) this.f3901l;
        InterfaceC4089l interfaceC4089l = (InterfaceC4089l) interfaceC0048l;
        ArrayList arrayListPro = interfaceC4089l.pro();
        if (arrayListPro != null) {
            return arrayListPro;
        }
        C18085l c18085lAd = interfaceC4089l.ad();
        List listBilling = interfaceC4089l.billing();
        int iFirebase = interfaceC0048l.firebase();
        Rational rational = null;
        if (listBilling == null) {
            sizeArr = null;
            break;
        }
        Iterator it = listBilling.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iFirebase) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = interfaceC15879l.appmetrica(iFirebase);
        }
        ArrayList arrayList = new ArrayList(listAsList);
        Collections.sort(arrayList, new C16027l(true));
        if (arrayList.isEmpty()) {
            AbstractC5088l.tapsense("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iFirebase + ".");
        }
        if (c18085lAd == null) {
            C4643l c4643l = (C4643l) this.f3902l;
            c4643l.getClass();
            if (arrayList.isEmpty()) {
                return arrayList;
            }
            ArrayList<Size> arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2, new C16027l(true));
            ArrayList arrayList3 = new ArrayList();
            InterfaceC4089l interfaceC4089l2 = (InterfaceC4089l) interfaceC0048l;
            Size sizeMo1484import = interfaceC4089l2.mo1484import();
            Size size = (Size) arrayList2.get(0);
            if (sizeMo1484import == null) {
                sizeMo1484import = size;
            } else if (AbstractC5513l.yandex(size) < sizeMo1484import.getHeight() * sizeMo1484import.getWidth()) {
                sizeMo1484import = size;
            }
            Size sizeYandex = c4643l.yandex(interfaceC4089l2);
            Size size2 = AbstractC5513l.crashlytics;
            int iYandex = AbstractC5513l.yandex(size2);
            if (AbstractC5513l.yandex(sizeMo1484import) < iYandex) {
                size2 = AbstractC5513l.yandex;
            } else if (sizeYandex != null) {
                if (sizeYandex.getHeight() * sizeYandex.getWidth() < iYandex) {
                    size2 = sizeYandex;
                }
            }
            for (Size size3 : arrayList2) {
                if (AbstractC5513l.yandex(size3) <= sizeMo1484import.getHeight() * sizeMo1484import.getWidth()) {
                    if (size3.getHeight() * size3.getWidth() >= AbstractC5513l.yandex(size2) && !arrayList3.contains(size3)) {
                        arrayList3.add(size3);
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeMo1484import + "\ninitial size list: " + arrayList2);
            }
            if (!interfaceC4089l2.mo1482continue()) {
                Size sizeYandex2 = c4643l.yandex(interfaceC4089l2);
                if (sizeYandex2 != null) {
                    Iterator it2 = mopub(arrayList3).iterator();
                    do {
                        if (!it2.hasNext()) {
                            rational = new Rational(sizeYandex2.getWidth(), sizeYandex2.getHeight());
                            break;
                        }
                        rational = (Rational) it2.next();
                    } while (!AbstractC14608l.yandex(sizeYandex2, rational, AbstractC5513l.crashlytics));
                }
            } else {
                rational = subs(interfaceC4089l2.mo1485interface(), c4643l.crashlytics);
            }
            if (sizeYandex == null) {
                sizeYandex = interfaceC4089l2.appmetrica();
            }
            ArrayList arrayList4 = new ArrayList();
            new HashMap();
            if (rational == null) {
                arrayList4.addAll(arrayList3);
                if (sizeYandex != null) {
                    remoteconfig(arrayList4, sizeYandex, true);
                    return arrayList4;
                }
            } else {
                HashMap mapIsPro = isPro(arrayList3);
                if (sizeYandex != null) {
                    Iterator it3 = mapIsPro.keySet().iterator();
                    while (it3.hasNext()) {
                        remoteconfig((List) mapIsPro.get((Rational) it3.next()), sizeYandex, true);
                    }
                }
                ArrayList arrayList5 = new ArrayList(mapIsPro.keySet());
                Collections.sort(arrayList5, new C14243l(rational, (Rational) c4643l.amazon));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    for (Size size4 : (List) mapIsPro.get((Rational) it4.next())) {
                        if (!arrayList4.contains(size4)) {
                            arrayList4.add(size4);
                        }
                    }
                }
            }
            return arrayList4;
        }
        Size sizeMo1484import2 = ((InterfaceC4089l) interfaceC0048l).mo1484import();
        int iMo1483finally = interfaceC4089l.mo1483finally(0);
        if (!interfaceC0048l.license()) {
            interfaceC0048l.firebase();
        }
        AbstractC5088l.yandex("SupportedOutputSizesCollector", "useCaseConfig = " + interfaceC0048l + ", candidateSizes = " + arrayList);
        C18085l c18085lAdmob = interfaceC4089l.admob();
        Rational rational2 = (Rational) this.f3900l;
        int i = this.f3898l;
        int i2 = this.f3897l;
        C14513l c14513l = c18085lAdmob.yandex;
        HashMap mapIsPro2 = isPro(arrayList);
        Rational rationalSubs = subs(c14513l.f28392l, rational2 == null || rational2.getNumerator() >= rational2.getDenominator());
        ArrayList<Rational> arrayList6 = new ArrayList(mapIsPro2.keySet());
        Collections.sort(arrayList6, new C14243l(rationalSubs, rational2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList6) {
            linkedHashMap.put(rational3, (List) mapIsPro2.get(rational3));
        }
        if (sizeMo1484import2 != null) {
            Size size5 = AbstractC5513l.yandex;
            int height = sizeMo1484import2.getHeight() * sizeMo1484import2.getWidth();
            Iterator it5 = linkedHashMap.keySet().iterator();
            while (it5.hasNext()) {
                List<Size> list = (List) linkedHashMap.get((Rational) it5.next());
                ArrayList arrayList7 = new ArrayList();
                for (Size size6 : list) {
                    if (AbstractC5513l.yandex(size6) <= height) {
                        arrayList7.add(size6);
                    }
                }
                list.clear();
                list.addAll(arrayList7);
            }
        }
        C10077l c10077l = c18085lAdmob.loadAd;
        if (c10077l != null) {
            Iterator it6 = linkedHashMap.keySet().iterator();
            while (it6.hasNext()) {
                List list2 = (List) linkedHashMap.get((Rational) it6.next());
                if (!list2.isEmpty()) {
                    int i3 = c10077l.loadAd;
                    if (c10077l != C10077l.crashlytics) {
                        Size size7 = c10077l.yandex;
                        if (i3 == 0) {
                            boolean zContains = list2.contains(size7);
                            list2.clear();
                            if (zContains) {
                                list2.add(size7);
                            }
                        } else if (i3 == 1) {
                            remoteconfig(list2, size7, true);
                        } else if (i3 == 2) {
                            remoteconfig(list2, size7, false);
                        } else if (i3 == 3) {
                            vip(list2, size7, true);
                        } else if (i3 == 4) {
                            vip(list2, size7, false);
                        }
                    }
                }
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = linkedHashMap.values().iterator();
        while (it7.hasNext()) {
            for (Size size8 : (List) it7.next()) {
                if (!arrayList8.contains(size8)) {
                    arrayList8.add(size8);
                }
            }
        }
        C6536l c6536l = c18085lAdmob.crashlytics;
        if (c6536l == null) {
            return arrayList8;
        }
        AbstractC7799l.loadAd(AbstractC7799l.purchase(iMo1483finally), i, i2 == 1);
        ArrayList arrayList9 = new ArrayList(arrayList8);
        Size size9 = (Size) c6536l.f13620l;
        ArrayList arrayList10 = new ArrayList(arrayList9);
        if (arrayList10.contains(size9)) {
            arrayList10.remove(size9);
            arrayList10.add(0, size9);
        }
        if (arrayList8.containsAll(arrayList10)) {
            return arrayList10;
        }
        C8339l.metrica("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
        return null;
    }

    public synchronized String amazon() {
        try {
            if (((String) this.f3902l) == null) {
                smaato();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3902l;
    }

    public PackageInfo billing(String str) {
        try {
            return ((Context) this.f3901l).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public synchronized String crashlytics() {
        try {
            if (((String) this.f3900l) == null) {
                smaato();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f3900l;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f3897l;
        byte[] bArr2 = (byte[]) this.f3901l;
        byte[] bArr3 = (byte[]) this.f3900l;
        C9598l c9598l = (C9598l) this.f3902l;
        int i3 = c9598l.f19550l;
        while (true) {
            int i4 = this.f3898l;
            if (i4 >= i3) {
                c9598l.m2701throws(bArr3, 0, bArr2);
                ((InterfaceC10952l) c9598l.f19554l).tapsense(0, 0, (byte[]) c9598l.f19553l, bArr2);
                System.arraycopy(bArr2, 0, bArr, 0, i2);
                reset();
                return i2;
            }
            bArr3[i4] = 0;
            this.f3898l = i4 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    public boolean firebase() {
        int i;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i = this.f3897l;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f3901l).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else if (AbstractC12300l.subs()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC12300l.subs()) {
                            this.f3897l = 2;
                        } else {
                            this.f3897l = 1;
                        }
                        i = this.f3897l;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (AbstractC12300l.subs()) {
                            this.f3897l = 2;
                        } else {
                            this.f3897l = 1;
                        }
                        i = this.f3897l;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (AbstractC12300l.subs()) {
                                this.f3897l = 2;
                            } else {
                                this.f3897l = 1;
                            }
                            i = this.f3897l;
                        } else {
                            this.f3897l = 2;
                            i = 2;
                        }
                    } else {
                        this.f3897l = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        C9598l c9598l = (C9598l) this.f3902l;
        return ((InterfaceC10952l) c9598l.f19554l).getAlgorithmName() + "/CFB" + (c9598l.f19550l * 8);
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f3897l;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        reset();
        C9598l c9598l = (C9598l) this.f3902l;
        InterfaceC10952l interfaceC10952l = (InterfaceC10952l) c9598l.f19554l;
        InterfaceC10952l interfaceC10952l2 = (InterfaceC10952l) c9598l.f19554l;
        byte[] bArr = (byte[]) c9598l.f19553l;
        byte[] bArr2 = (byte[]) c9598l.f19549l;
        if (!(interfaceC9719l instanceof C0272l)) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            interfaceC10952l2.reset();
            interfaceC10952l.init(true, interfaceC9719l);
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr3 = c0272l.f1273l;
        if (bArr3.length < bArr2.length) {
            System.arraycopy(bArr3, 0, bArr2, bArr2.length - bArr3.length, bArr3.length);
        } else {
            System.arraycopy(bArr3, 0, bArr2, 0, bArr2.length);
        }
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        interfaceC10952l2.reset();
        interfaceC10952l.init(true, c0272l.f1272l);
    }

    public void loadAd(int i, boolean z, byte[] bArr) {
        int length = bArr.length - i;
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f3902l;
        if (length < interfaceC16922l.getDigestSize()) {
            C8339l.metrica("target length is less than digest size.");
            return;
        }
        byte[] bArr2 = (byte[]) this.f3901l;
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        interfaceC16922l.update((byte) (this.f3898l >>> 24));
        interfaceC16922l.update((byte) (this.f3898l >>> 16));
        interfaceC16922l.update((byte) (this.f3898l >>> 8));
        interfaceC16922l.update((byte) this.f3898l);
        interfaceC16922l.update((byte) (this.f3897l >>> 8));
        interfaceC16922l.update((byte) this.f3897l);
        interfaceC16922l.update((byte) -1);
        byte[] bArr3 = (byte[]) this.f3900l;
        interfaceC16922l.update(bArr3, 0, bArr3.length);
        interfaceC16922l.doFinal(bArr, i);
        if (z) {
            this.f3897l++;
        }
    }

    public void metrica(int i, int i2) {
        long[] jArr = (long[]) this.f3901l;
        int[] iArr = (int[]) this.f3900l;
        int[] iArr2 = (int[]) this.f3902l;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f3900l;
            if (i >= bArr.length) {
                this.f3898l = 0;
                C9598l c9598l = (C9598l) this.f3902l;
                byte[] bArr2 = (byte[]) c9598l.f19549l;
                System.arraycopy(bArr2, 0, (byte[]) c9598l.f19553l, 0, bArr2.length);
                ((InterfaceC10952l) c9598l.f19554l).reset();
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    public synchronized void smaato() {
        PackageInfo packageInfoBilling = billing(((Context) this.f3901l).getPackageName());
        if (packageInfoBilling != null) {
            this.f3900l = Integer.toString(packageInfoBilling.versionCode);
            this.f3902l = packageInfoBilling.versionName;
        }
    }

    public String toString() {
        String str;
        switch (this.f3899l) {
            case 1:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                int i = this.f3898l;
                if (i == 0) {
                    i = 0;
                }
                String str2 = "null";
                if (i == 1) {
                    str = "LANGUAGE_VERSION";
                } else if (i == 2) {
                    str = "COMPILER_VERSION";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "UNKNOWN";
                } else {
                    str = "API_VERSION";
                }
                sb.append(str);
                sb.append(", level=");
                int i2 = this.f3897l;
                int i3 = i2 != 0 ? i2 : 0;
                if (i3 == 1) {
                    str2 = "WARNING";
                } else if (i3 == 2) {
                    str2 = "ERROR";
                } else if (i3 == 3) {
                    str2 = "HIDDEN";
                }
                sb.append(str2);
                sb.append(", version=");
                C14418l c14418l = (C14418l) this.f3902l;
                if (c14418l == null) {
                    c14418l = null;
                }
                sb.append(c14418l);
                sb.append(", errorCode=");
                sb.append((Integer) this.f3901l);
                sb.append(", message=");
                return AbstractC2812l.tapsense(sb, (String) this.f3900l, ')');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f3901l;
        byte[] bArr3 = (byte[]) this.f3900l;
        C9598l c9598l = (C9598l) this.f3902l;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return;
        }
        int i3 = c9598l.f19550l;
        int i4 = this.f3898l;
        int i5 = i3 - i4;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            c9598l.m2701throws(bArr3, 0, bArr2);
            this.f3898l = 0;
            i2 -= i5;
            i += i5;
            while (i2 > i3) {
                c9598l.m2701throws(bArr, i, bArr2);
                i2 -= i3;
                i += i3;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f3898l, i2);
        this.f3898l += i2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int yandex(long j) {
        int i = this.f3898l + 1;
        long[] jArr = (long[]) this.f3901l;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            AbstractC8669l.premium(0, 0, (int[]) this.f3900l, r2, 14);
            this.f3901l = jArr2;
            this.f3900l = r2;
        }
        int i3 = this.f3898l;
        this.f3898l = i3 + 1;
        int length2 = ((int[]) this.f3902l).length;
        if (this.f3897l >= length2) {
            int i4 = length2 * 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr[i5] = i6;
                i5 = i6;
            }
            AbstractC8669l.premium(0, 0, (int[]) this.f3902l, iArr, 14);
            this.f3902l = iArr;
        }
        int i7 = this.f3897l;
        int[] iArr2 = (int[]) this.f3902l;
        this.f3897l = iArr2[i7];
        long[] jArr3 = (long[]) this.f3901l;
        jArr3[i3] = j;
        ((int[]) this.f3900l)[i3] = i7;
        iArr2[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (AbstractC8576l.isPro(jArr3[i8], j) <= 0) {
                break;
            }
            metrica(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        int i = this.f3898l;
        byte[] bArr = (byte[]) this.f3900l;
        if (i == bArr.length) {
            ((C9598l) this.f3902l).m2701throws(bArr, 0, (byte[]) this.f3901l);
            this.f3898l = 0;
        }
        int i2 = this.f3898l;
        this.f3898l = i2 + 1;
        bArr[i2] = b;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [byte[], java.io.Serializable] */
    public C1577l(InterfaceC10952l interfaceC10952l) {
        this.f3899l = 0;
        int iLicense = (interfaceC10952l.license() * 8) / 2;
        if (iLicense % 8 != 0) {
            C8339l.metrica("MAC size must be multiple of 8");
            throw null;
        }
        this.f3901l = new byte[interfaceC10952l.license()];
        C9598l c9598l = new C9598l(4);
        c9598l.f19554l = interfaceC10952l;
        c9598l.f19550l = 1;
        c9598l.f19549l = new byte[interfaceC10952l.license()];
        c9598l.f19553l = new byte[interfaceC10952l.license()];
        c9598l.f19552l = new byte[interfaceC10952l.license()];
        this.f3902l = c9598l;
        this.f3897l = iLicense / 8;
        this.f3900l = new byte[1];
        this.f3898l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1577l(byte[] bArr, byte[] bArr2, InterfaceC16922l interfaceC16922l) {
        this.f3899l = 3;
        this.f3901l = bArr;
        this.f3900l = bArr2;
        this.f3902l = interfaceC16922l;
    }

    public C1577l(Context context) {
        this.f3899l = 2;
        this.f3897l = 0;
        this.f3901l = context;
    }

    public /* synthetic */ C1577l(int i) {
        this.f3899l = i;
    }
}
