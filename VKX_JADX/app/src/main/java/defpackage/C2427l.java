package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: lؔؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2427l {
    public static final String admob;
    public static final String firebase;
    public static final String isPro;
    public static final C2427l mopub;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String subs;
    public final C3852l amazon;
    public final C11470l billing;
    public final C7828l crashlytics;
    public final C17805l loadAd;
    public final C9202l purchase;
    public final String yandex;

    static {
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        mopub = new C2427l("", new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, C11470l.amazon);
        admob = Integer.toString(0, 36);
        subs = Integer.toString(1, 36);
        isPro = Integer.toString(2, 36);
        firebase = Integer.toString(3, 36);
        smaato = Integer.toString(4, 36);
        remoteconfig = Integer.toString(5, 36);
    }

    public C2427l(String str, C9202l c9202l, C17805l c17805l, C7828l c7828l, C3852l c3852l, C11470l c11470l) {
        this.yandex = str;
        this.loadAd = c17805l;
        this.crashlytics = c7828l;
        this.amazon = c3852l;
        this.purchase = c9202l;
        this.billing = c11470l;
    }

    public static C2427l loadAd(Uri uri) {
        C17805l c17805l;
        C0935l c0935l = new C0935l();
        C17464l c17464l = new C17464l();
        List list = Collections.EMPTY_LIST;
        C13708l c13708l = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        AbstractC12442l.subscription(((Uri) c17464l.purchase) == null || ((UUID) c17464l.amazon) != null);
        C14227l c14227l = null;
        if (uri != null) {
            if (((UUID) c17464l.amazon) != null) {
                c14227l = new C14227l(c17464l);
            }
            c17805l = new C17805l(uri, null, c14227l, null, list, null, c13708l, null, -9223372036854775807L);
        } else {
            c17805l = null;
        }
        return new C2427l("", new C9202l(c0935l), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v59 */
    public static C2427l yandex(int i, Bundle bundle) {
        C9202l c9202l;
        C11470l c11470l;
        Map mapLoadAd;
        C14227l c14227l;
        C8842l c8842l;
        C13708l c13708lMopub;
        C13708l c13708lPurchase;
        C17805l c17805l;
        String string = bundle.getString(admob, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(subs);
        C7828l c7828lLoadAd = bundle2 == null ? C7828l.billing : C7828l.loadAd(bundle2);
        Bundle bundle3 = bundle.getBundle(isPro);
        C3852l c3852lLoadAd = bundle3 == null ? C3852l.f7980private : C3852l.loadAd(i, bundle3);
        Bundle bundle4 = bundle.getBundle(firebase);
        boolean z = false;
        if (bundle4 == null) {
            c9202l = C9202l.ads;
        } else {
            C0935l c0935l = new C0935l();
            String str = C16084l.isPro;
            C16084l c16084l = C16084l.subs;
            long j = c16084l.yandex;
            long j2 = c16084l.amazon;
            long j3 = c16084l.loadAd;
            long jM3962continue = AbstractC15323l.m3962continue(bundle4.getLong(str, j));
            boolean z2 = true;
            AbstractC12442l.admob(jM3962continue >= 0);
            c0935l.yandex = jM3962continue;
            long jM3962continue2 = AbstractC15323l.m3962continue(bundle4.getLong(C16084l.firebase, c16084l.crashlytics));
            AbstractC12442l.admob(jM3962continue2 == Long.MIN_VALUE || jM3962continue2 >= 0);
            c0935l.loadAd = jM3962continue2;
            c0935l.crashlytics = bundle4.getBoolean(C16084l.smaato, c16084l.purchase);
            c0935l.amazon = bundle4.getBoolean(C16084l.remoteconfig, c16084l.billing);
            c0935l.purchase = bundle4.getBoolean(C16084l.vip, c16084l.mopub);
            c0935l.billing = bundle4.getBoolean(C16084l.adcel, c16084l.admob);
            long j4 = bundle4.getLong(C16084l.metrica, j3);
            if (j4 != j3) {
                AbstractC12442l.admob(j4 >= 0);
                c0935l.yandex = j4;
            }
            long j5 = bundle4.getLong(C16084l.startapp, j2);
            if (j5 != j2) {
                if (j5 != Long.MIN_VALUE && j5 < 0) {
                    z2 = false;
                }
                AbstractC12442l.admob(z2);
                c0935l.loadAd = j5;
            }
            c9202l = new C9202l(c0935l);
        }
        C9202l c9202l2 = c9202l;
        Bundle bundle5 = bundle.getBundle(smaato);
        if (bundle5 == null) {
            c11470l = C11470l.amazon;
        } else {
            C0554l c0554l = new C0554l();
            c0554l.f1958l = (Uri) bundle5.getParcelable(C11470l.purchase);
            c0554l.f1957l = bundle5.getString(C11470l.billing);
            c0554l.f1956l = AbstractC15323l.startapp(bundle5.getBundle(C11470l.mopub));
            c11470l = new C11470l(c0554l);
        }
        C11470l c11470l2 = c11470l;
        Bundle bundle6 = bundle.getBundle(remoteconfig);
        if (bundle6 == null) {
            c17805l = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(C17805l.smaato);
            if (bundle7 == null) {
                c14227l = null;
            } else {
                String string2 = bundle7.getString(C14227l.subs);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(C14227l.isPro);
                String str2 = C14227l.firebase;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapLoadAd = C15333l.f29966l;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapLoadAd = AbstractC13675l.loadAd(map);
                }
                boolean z3 = bundle7.getBoolean(C14227l.smaato, false);
                boolean z4 = bundle7.getBoolean(C14227l.remoteconfig, false);
                boolean z5 = bundle7.getBoolean(C14227l.vip, false);
                String str4 = C14227l.metrica;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(arrayList);
                byte[] byteArray = bundle7.getByteArray(C14227l.startapp);
                C17464l c17464l = new C17464l();
                c17464l.amazon = uuidFromString;
                c17464l.purchase = uri;
                c17464l.billing = AbstractC13675l.loadAd(mapLoadAd);
                c17464l.yandex = z3;
                c17464l.crashlytics = z5;
                c17464l.loadAd = z4;
                c17464l.mopub = AbstractC1186l.Signature(abstractC1186lSignature);
                c17464l.admob = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : 0;
                c14227l = new C14227l(c17464l);
            }
            Bundle bundle10 = bundle6.getBundle(C17805l.remoteconfig);
            if (bundle10 == null) {
                c8842l = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(C8842l.loadAd);
                uri2.getClass();
                C7972l c7972l = new C7972l(18, z);
                c7972l.f16631l = uri2;
                c8842l = new C8842l(c7972l);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(C17805l.vip);
            if (parcelableArrayList == null) {
                C9258l c9258l = AbstractC1186l.f3181l;
                c13708lMopub = C13708l.f26763l;
            } else {
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    c16971lMetrica.crashlytics(new C17945l(bundle11.getInt(C17945l.f34922l, 0), bundle11.getInt(C17945l.f34921l, 0), bundle11.getInt(C17945l.f34923l, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                c13708lMopub = c16971lMetrica.mopub();
            }
            C13708l c13708l = c13708lMopub;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(C17805l.startapp);
            if (parcelableArrayList2 == null) {
                C9258l c9258l2 = AbstractC1186l.f3181l;
                c13708lPurchase = C13708l.f26763l;
            } else {
                c13708lPurchase = AbstractC3483l.purchase(new C2922l(10), parcelableArrayList2);
            }
            C13708l c13708l2 = c13708lPurchase;
            long j6 = bundle6.getLong(C17805l.adcel, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(C17805l.isPro);
            uri3.getClass();
            c17805l = new C17805l(uri3, bundle6.getString(C17805l.firebase), c14227l, c8842l, c13708l, bundle6.getString(C17805l.metrica), c13708l2, null, j6);
        }
        return new C2427l(string, c9202l2, c17805l, c7828lLoadAd, c3852lLoadAd, c11470l2);
    }

    public final Bundle crashlytics(int i, boolean z) {
        C17805l c17805l;
        Bundle bundle = new Bundle();
        String str = this.yandex;
        if (!str.equals("")) {
            bundle.putString(admob, str);
        }
        C7828l c7828l = C7828l.billing;
        C7828l c7828l2 = this.crashlytics;
        if (!c7828l2.equals(c7828l)) {
            bundle.putBundle(subs, c7828l2.crashlytics());
        }
        C3852l c3852l = C3852l.f7980private;
        C3852l c3852l2 = this.amazon;
        if (!c3852l2.equals(c3852l)) {
            bundle.putBundle(isPro, c3852l2.crashlytics(i));
        }
        C16084l c16084l = C16084l.subs;
        C9202l c9202l = this.purchase;
        if (!c9202l.equals(c16084l)) {
            Bundle bundle2 = new Bundle();
            long j = c9202l.yandex;
            if (j != c16084l.yandex) {
                bundle2.putLong(C16084l.isPro, j);
            }
            long j2 = c9202l.crashlytics;
            if (j2 != c16084l.crashlytics) {
                bundle2.putLong(C16084l.firebase, j2);
            }
            long j3 = c9202l.loadAd;
            if (j3 != c16084l.loadAd) {
                bundle2.putLong(C16084l.metrica, j3);
            }
            long j4 = c9202l.amazon;
            if (j4 != c16084l.amazon) {
                bundle2.putLong(C16084l.startapp, j4);
            }
            boolean z2 = c9202l.purchase;
            if (z2 != c16084l.purchase) {
                bundle2.putBoolean(C16084l.smaato, z2);
            }
            boolean z3 = c9202l.billing;
            if (z3 != c16084l.billing) {
                bundle2.putBoolean(C16084l.remoteconfig, z3);
            }
            boolean z4 = c9202l.mopub;
            if (z4 != c16084l.mopub) {
                bundle2.putBoolean(C16084l.vip, z4);
            }
            boolean z5 = c9202l.admob;
            if (z5 != c16084l.admob) {
                bundle2.putBoolean(C16084l.adcel, z5);
            }
            bundle.putBundle(firebase, bundle2);
        }
        C11470l c11470l = C11470l.amazon;
        C11470l c11470l2 = this.billing;
        if (!c11470l2.equals(c11470l)) {
            Bundle bundle3 = new Bundle();
            Uri uri = c11470l2.yandex;
            if (uri != null) {
                bundle3.putParcelable(C11470l.purchase, uri);
            }
            String str2 = c11470l2.loadAd;
            if (str2 != null) {
                bundle3.putString(C11470l.billing, str2);
            }
            Bundle bundle4 = c11470l2.crashlytics;
            if (bundle4 != null) {
                bundle3.putBundle(C11470l.mopub, bundle4);
            }
            bundle.putBundle(smaato, bundle3);
        }
        if (z && (c17805l = this.loadAd) != null) {
            AbstractC1186l abstractC1186l = c17805l.mopub;
            List list = c17805l.purchase;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(C17805l.isPro, c17805l.yandex);
            String str3 = c17805l.loadAd;
            if (str3 != null) {
                bundle5.putString(C17805l.firebase, str3);
            }
            C14227l c14227l = c17805l.crashlytics;
            if (c14227l != null) {
                String str4 = C17805l.smaato;
                AbstractC1186l abstractC1186l2 = c14227l.mopub;
                AbstractC13675l abstractC13675l = c14227l.crashlytics;
                Bundle bundle6 = new Bundle();
                bundle6.putString(C14227l.subs, c14227l.yandex.toString());
                Uri uri2 = c14227l.loadAd;
                if (uri2 != null) {
                    bundle6.putParcelable(C14227l.isPro, uri2);
                }
                if (!abstractC13675l.isEmpty()) {
                    String str5 = C14227l.firebase;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : abstractC13675l.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = c14227l.amazon;
                if (z6) {
                    bundle6.putBoolean(C14227l.smaato, z6);
                }
                boolean z7 = c14227l.purchase;
                if (z7) {
                    bundle6.putBoolean(C14227l.remoteconfig, z7);
                }
                boolean z8 = c14227l.billing;
                if (z8) {
                    bundle6.putBoolean(C14227l.vip, z8);
                }
                if (!abstractC1186l2.isEmpty()) {
                    bundle6.putIntegerArrayList(C14227l.metrica, new ArrayList<>(abstractC1186l2));
                }
                byte[] bArr = c14227l.admob;
                if (bArr != null) {
                    bundle6.putByteArray(C14227l.startapp, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            C8842l c8842l = c17805l.amazon;
            if (c8842l != null) {
                String str6 = C17805l.remoteconfig;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(C8842l.loadAd, c8842l.yandex);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(C17805l.vip, AbstractC3483l.subs(list, new C2922l(8)));
            }
            String str7 = c17805l.billing;
            if (str7 != null) {
                bundle5.putString(C17805l.metrica, str7);
            }
            if (!abstractC1186l.isEmpty()) {
                bundle5.putParcelableArrayList(C17805l.startapp, AbstractC3483l.subs(abstractC1186l, new C2922l(9)));
            }
            long j5 = c17805l.subs;
            if (j5 != -9223372036854775807L) {
                bundle5.putLong(C17805l.adcel, j5);
            }
            bundle.putBundle(remoteconfig, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2427l)) {
            return false;
        }
        C2427l c2427l = (C2427l) obj;
        return Objects.equals(this.yandex, c2427l.yandex) && this.purchase.equals(c2427l.purchase) && Objects.equals(this.loadAd, c2427l.loadAd) && Objects.equals(this.crashlytics, c2427l.crashlytics) && Objects.equals(this.amazon, c2427l.amazon) && Objects.equals(this.billing, c2427l.billing);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C17805l c17805l = this.loadAd;
        return this.billing.hashCode() + ((this.amazon.hashCode() + ((this.purchase.hashCode() + ((this.crashlytics.hashCode() + ((iHashCode + (c17805l != null ? c17805l.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
