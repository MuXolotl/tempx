package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٌۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9201l {
    public static final String admob;
    public static final String firebase;
    public static final String isPro;
    public static final String mopub;
    public static final String smaato;
    public static final String subs;
    public final int amazon;
    public final C18503l billing;
    public final Object crashlytics;
    public final long loadAd;
    public final C17425l purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        mopub = Integer.toString(0, 36);
        admob = Integer.toString(1, 36);
        subs = Integer.toString(2, 36);
        isPro = Integer.toString(3, 36);
        firebase = Integer.toString(4, 36);
        smaato = Integer.toString(5, 36);
    }

    public C9201l(int i, long j, C17425l c17425l, C18503l c18503l, Object obj, int i2) {
        this.yandex = i;
        this.loadAd = j;
        this.purchase = c17425l;
        this.billing = c18503l;
        this.crashlytics = obj;
        this.amazon = i2;
    }

    public static void amazon(C2427l c2427l) {
        AbstractC12442l.subs(!TextUtils.isEmpty(c2427l.yandex), "mediaId must not be empty");
        C3852l c3852l = c2427l.amazon;
        AbstractC12442l.subs(c3852l.ads != null, "mediaMetadata must specify isBrowsable");
        AbstractC12442l.subs(c3852l.subscription != null, "mediaMetadata must specify isPlayable");
    }

    public static C9201l crashlytics(List list, C17425l c17425l) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amazon((C2427l) it.next());
        }
        return new C9201l(0, SystemClock.elapsedRealtime(), c17425l, null, AbstractC1186l.Signature(list), 3);
    }

    public static C9201l loadAd(int i) {
        C18503l c18503l = new C18503l("no error message provided", i, Bundle.EMPTY);
        return new C9201l(c18503l.yandex, SystemClock.elapsedRealtime(), null, c18503l, null, 4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[LOOP:0: B:28:0x0060->B:30:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    public static C9201l yandex(int i, Bundle bundle) {
        C18503l c18503l;
        C18503l c18503l2;
        int i2;
        String str;
        Bundle bundle2;
        IBinder binder;
        AbstractC1186l abstractC1186lYandex;
        C16971l c16971lMetrica;
        int i3 = bundle.getInt(mopub, 0);
        long j = bundle.getLong(admob, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(subs);
        Object objYandex = null;
        C17425l c17425lYandex = bundle3 == null ? null : C17425l.yandex(bundle3);
        Bundle bundle4 = bundle.getBundle(smaato);
        if (bundle4 == null) {
            if (i3 != 0) {
                c18503l2 = new C18503l(i3);
            } else {
                c18503l = null;
            }
            i2 = bundle.getInt(firebase);
            if (i2 != 1) {
                str = isPro;
                if (i2 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        objYandex = C2427l.yandex(i, bundle2);
                    }
                } else if (i2 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        abstractC1186lYandex = BinderC11373l.yandex(binder);
                        c16971lMetrica = AbstractC1186l.metrica();
                        for (int i4 = 0; i4 < abstractC1186lYandex.size(); i4++) {
                            Bundle bundle5 = (Bundle) abstractC1186lYandex.get(i4);
                            bundle5.getClass();
                            c16971lMetrica.crashlytics(C2427l.yandex(i, bundle5));
                        }
                        objYandex = c16971lMetrica.mopub();
                    }
                } else if (i2 != 4) {
                    C18073l.admob();
                    return null;
                }
            }
            return new C9201l(i3, j, c17425lYandex, c18503l, objYandex, i2);
        }
        c18503l2 = C18503l.yandex(bundle4);
        c18503l = c18503l2;
        i2 = bundle.getInt(firebase);
        if (i2 != 1) {
            str = isPro;
            if (i2 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    objYandex = C2427l.yandex(i, bundle2);
                }
            } else if (i2 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    abstractC1186lYandex = BinderC11373l.yandex(binder);
                    c16971lMetrica = AbstractC1186l.metrica();
                    while (i4 < abstractC1186lYandex.size()) {
                        Bundle bundle6 = (Bundle) abstractC1186lYandex.get(i4);
                        bundle6.getClass();
                        c16971lMetrica.crashlytics(C2427l.yandex(i, bundle6));
                    }
                    objYandex = c16971lMetrica.mopub();
                }
            } else if (i2 != 4) {
                C18073l.admob();
                return null;
            }
        }
        return new C9201l(i3, j, c17425lYandex, c18503l, objYandex, i2);
    }
}
