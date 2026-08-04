package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٕؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1153l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3127l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3128l;

    public /* synthetic */ C1153l(int i, int i2) {
        this.f3128l = i2;
        this.f3127l = i;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        C12869l c12869l;
        C8597l[] c8597lArr;
        int i;
        C2427l[] c2427lArr;
        long[] jArr;
        String[] strArr;
        C11660l[] c11660lArr;
        int i2;
        Bundle bundle;
        C11660l c11660l;
        int i3 = this.f3128l;
        int i4 = this.f3127l;
        switch (i3) {
            case 0:
                return Integer.valueOf(i4);
            case 1:
                C12551l c12551l = (C12551l) obj;
                int i5 = c12551l.yandex;
                int i6 = c12551l.amazon;
                return new C12551l(i4 == 0, i5, (i4 < i6 || i4 > c12551l.purchase) ? c12551l.loadAd : i4, i6, c12551l.purchase);
            case 2:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(C4322l.tapsense);
                C2427l c2427lYandex = bundle3 != null ? C2427l.yandex(i4, bundle3) : C2427l.mopub;
                long j = bundle2.getLong(C4322l.Signature, -9223372036854775807L);
                long j2 = bundle2.getLong(C4322l.license, -9223372036854775807L);
                long j3 = bundle2.getLong(C4322l.pro, -9223372036854775807L);
                boolean z = bundle2.getBoolean(C4322l.ad, false);
                boolean z2 = bundle2.getBoolean(C4322l.advert, false);
                Bundle bundle4 = bundle2.getBundle(C4322l.isVip);
                C7828l c7828lLoadAd = bundle4 != null ? C7828l.loadAd(bundle4) : null;
                boolean z3 = bundle2.getBoolean(C4322l.signatures, false);
                long j4 = bundle2.getLong(C4322l.premium, 0L);
                long j5 = bundle2.getLong(C4322l.applovin, -9223372036854775807L);
                int i7 = bundle2.getInt(C4322l.appmetrica, 0);
                int i8 = bundle2.getInt(C4322l.inmobi, 0);
                long j6 = bundle2.getLong(C4322l.f8859throws, 0L);
                C4322l c4322l = new C4322l();
                c4322l.loadAd(C4322l.ads, c2427lYandex, null, j, j2, j3, z, z2, c7828lLoadAd, j4, j5, i7, i8, j6);
                c4322l.firebase = z3;
                return c4322l;
            default:
                Bundle bundle5 = (Bundle) obj;
                int i9 = bundle5.getInt(C3904l.admob, 0);
                long j7 = bundle5.getLong(C3904l.subs, -9223372036854775807L);
                long j8 = bundle5.getLong(C3904l.isPro, 0L);
                boolean z4 = bundle5.getBoolean(C3904l.firebase, false);
                Bundle bundle6 = bundle5.getBundle(C3904l.smaato);
                if (bundle6 != null) {
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList(C12869l.admob);
                    if (parcelableArrayList == null) {
                        c8597lArr = new C8597l[0];
                    } else {
                        C8597l[] c8597lArr2 = new C8597l[parcelableArrayList.size()];
                        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                            Bundle bundle7 = (Bundle) parcelableArrayList.get(i10);
                            long j9 = bundle7.getLong(C8597l.remoteconfig);
                            int i11 = bundle7.getInt(C8597l.vip);
                            int i12 = bundle7.getInt(C8597l.tapsense);
                            ArrayList parcelableArrayList2 = bundle7.getParcelableArrayList(C8597l.metrica);
                            ArrayList parcelableArrayList3 = bundle7.getParcelableArrayList(C8597l.Signature);
                            int[] intArray = bundle7.getIntArray(C8597l.startapp);
                            long[] longArray = bundle7.getLongArray(C8597l.adcel);
                            long j10 = bundle7.getLong(C8597l.ads);
                            boolean z5 = bundle7.getBoolean(C8597l.subscription);
                            ArrayList<String> stringArrayList = bundle7.getStringArrayList(C8597l.license);
                            ArrayList parcelableArrayList4 = bundle7.getParcelableArrayList(C8597l.ad);
                            boolean z6 = bundle7.getBoolean(C8597l.pro);
                            if (intArray == null) {
                                intArray = new int[0];
                            }
                            int[] iArr = intArray;
                            if (parcelableArrayList3 != null) {
                                C2427l[] c2427lArr2 = new C2427l[parcelableArrayList3.size()];
                                for (int i13 = 0; i13 < parcelableArrayList3.size(); i13++) {
                                    Bundle bundle8 = (Bundle) parcelableArrayList3.get(i13);
                                    c2427lArr2[i13] = bundle8 == null ? null : C2427l.yandex(i4, bundle8);
                                }
                                c2427lArr = c2427lArr2;
                            } else {
                                if (parcelableArrayList2 != null) {
                                    C2427l[] c2427lArr3 = new C2427l[parcelableArrayList2.size()];
                                    for (int i14 = 0; i14 < parcelableArrayList2.size(); i14++) {
                                        Uri uri = (Uri) parcelableArrayList2.get(i14);
                                        c2427lArr3[i14] = uri == null ? null : C2427l.loadAd(uri);
                                    }
                                    c2427lArr = c2427lArr3;
                                } else {
                                    i = 0;
                                    c2427lArr = new C2427l[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i];
                                } else {
                                    jArr = longArray;
                                }
                                strArr = new String[i];
                                if (stringArrayList != null) {
                                    strArr = (String[]) stringArrayList.toArray(strArr);
                                }
                                String[] strArr2 = strArr;
                                if (parcelableArrayList4 == null) {
                                    c11660lArr = new C11660l[i];
                                } else {
                                    c11660lArr = new C11660l[parcelableArrayList4.size()];
                                    for (i2 = 0; i2 < parcelableArrayList4.size(); i2++) {
                                        bundle = (Bundle) parcelableArrayList4.get(i2);
                                        if (bundle == null) {
                                            c11660l = null;
                                        } else {
                                            c11660l = new C11660l(bundle.getString(C11660l.billing), bundle.getLong(C11660l.amazon), bundle.getLong(C11660l.purchase));
                                        }
                                        c11660lArr[i2] = c11660l;
                                    }
                                }
                                c8597lArr2[i10] = new C8597l(j9, i11, i12, iArr, c2427lArr, jArr, j10, z5, strArr2, c11660lArr, z6);
                            }
                            i = 0;
                            if (longArray == null) {
                                jArr = new long[i];
                            } else {
                                jArr = longArray;
                            }
                            strArr = new String[i];
                            if (stringArrayList != null) {
                                strArr = (String[]) stringArrayList.toArray(strArr);
                            }
                            String[] strArr3 = strArr;
                            if (parcelableArrayList4 == null) {
                                c11660lArr = new C11660l[i];
                            } else {
                                c11660lArr = new C11660l[parcelableArrayList4.size()];
                                while (i2 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i2);
                                    if (bundle == null) {
                                        c11660l = null;
                                    } else {
                                        c11660l = new C11660l(bundle.getString(C11660l.billing), bundle.getLong(C11660l.amazon), bundle.getLong(C11660l.purchase));
                                    }
                                    c11660lArr[i2] = c11660l;
                                }
                            }
                            c8597lArr2[i10] = new C8597l(j9, i11, i12, iArr, c2427lArr, jArr, j10, z5, strArr3, c11660lArr, z6);
                        }
                        c8597lArr = c8597lArr2;
                    }
                    c12869l = new C12869l(c8597lArr, bundle6.getLong(C12869l.subs, 0L), bundle6.getLong(C12869l.isPro, -9223372036854775807L), bundle6.getInt(C12869l.firebase, 0));
                } else {
                    c12869l = C12869l.billing;
                }
                C12869l c12869l2 = c12869l;
                C3904l c3904l = new C3904l();
                c3904l.subs(null, null, i9, j7, j8, c12869l2, z4);
                return c3904l;
        }
    }
}
