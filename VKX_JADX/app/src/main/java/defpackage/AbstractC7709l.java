package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: lًؘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7709l {
    public static C5197l mopub;
    public static final C15578l yandex = new C15578l(-689463307, false, new C1659l(25));
    public static final C15578l loadAd = new C15578l(-1509239180, false, new C8918l(27));
    public static final C15578l crashlytics = new C15578l(1361481885, false, new C8918l(28));
    public static final C15578l amazon = new C15578l(1190642428, false, new C8918l(29));
    public static final C15578l purchase = new C15578l(-169089209, false, new C1659l(26));
    public static final C15578l billing = new C15578l(-1535354685, false, new C1659l(27));

    public static C0328l amazon(File file) {
        return new C0328l(new FileOutputStream(file, false), new C3446l());
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123  */
    public static final C11090l crashlytics(C11090l c11090l, EnumC9931l enumC9931l) {
        int i;
        long j;
        C13299l c13299l;
        int i2;
        int i3;
        int i4;
        C10068l c10068l;
        C14264l c14264l = c11090l.yandex;
        InterfaceC12750l interfaceC12750l = AbstractC2828l.amazon;
        InterfaceC12750l interfaceC12750lCrashlytics = c14264l.yandex.crashlytics(new C5146l(24));
        long j2 = c14264l.loadAd;
        C12735l[] c12735lArr = C1794l.loadAd;
        if ((j2 & 1095216660480L) == 0) {
            j2 = AbstractC2828l.yandex;
        }
        long j3 = j2;
        C6886l c6886l = c14264l.crashlytics;
        if (c6886l == null) {
            c6886l = C6886l.f14425l;
        }
        C6886l c6886l2 = c6886l;
        C11617l c11617l = c14264l.amazon;
        C11617l c11617l2 = new C11617l(c11617l != null ? c11617l.yandex : 0);
        C8689l c8689l = c14264l.purchase;
        C8689l c8689l2 = new C8689l(c8689l != null ? c8689l.yandex : 65535);
        AbstractC17569l abstractC17569l = c14264l.billing;
        if (abstractC17569l == null) {
            abstractC17569l = AbstractC17569l.f34194l;
        }
        AbstractC17569l abstractC17569l2 = abstractC17569l;
        String str = c14264l.mopub;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = c14264l.admob;
        if ((j4 & 1095216660480L) == 0) {
            j4 = AbstractC2828l.loadAd;
        }
        long j5 = j4;
        C10524l c10524l = c14264l.subs;
        float f = c10524l != null ? c10524l.yandex : 0.0f;
        C10524l c10524l2 = new C10524l(Float.isNaN(f) ? 0.0f : f);
        C16810l c16810l = c14264l.isPro;
        if (c16810l == null) {
            c16810l = C16810l.crashlytics;
        }
        C16810l c16810l2 = c16810l;
        C10537l c10537lMo3369default = c14264l.firebase;
        if (c10537lMo3369default == null) {
            C10537l c10537l = C10537l.f21447l;
            c10537lMo3369default = AbstractC4189l.yandex.mo3369default();
        }
        C10537l c10537l2 = c10537lMo3369default;
        long j6 = c14264l.smaato;
        if (j6 == 16) {
            j6 = AbstractC2828l.crashlytics;
        }
        long j7 = j6;
        C9867l c9867l = c14264l.remoteconfig;
        if (c9867l == null) {
            c9867l = C9867l.loadAd;
        }
        C9867l c9867l2 = c9867l;
        C0387l c0387l = c14264l.vip;
        if (c0387l == null) {
            c0387l = C0387l.amazon;
        }
        C0387l c0387l2 = c0387l;
        C1354l c1354l = c14264l.metrica;
        AbstractC3239l abstractC3239l = c14264l.startapp;
        if (abstractC3239l == null) {
            abstractC3239l = C5053l.yandex;
        }
        C14264l c14264l2 = new C14264l(interfaceC12750lCrashlytics, j3, c6886l2, c11617l2, c8689l2, abstractC17569l2, str2, j5, c10524l2, c16810l2, c10537l2, j7, c9867l2, c0387l2, c1354l, abstractC3239l);
        C9077l c9077l = c11090l.loadAd;
        int i5 = AbstractC6992l.loadAd;
        int i6 = c9077l.yandex;
        int i7 = 5;
        int i8 = i6 == 0 ? 5 : i6;
        int i9 = c9077l.loadAd;
        if (i9 != 3) {
            if (i9 == 0) {
                int iOrdinal = enumC9931l.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return null;
                    }
                    i7 = 2;
                }
            } else {
                i = i9;
            }
            j = c9077l.crashlytics;
            if ((j & 1095216660480L) == 0) {
                j = AbstractC6992l.yandex;
            }
            c13299l = c9077l.amazon;
            if (c13299l == null) {
                c13299l = C13299l.crashlytics;
            }
            C13299l c13299l2 = c13299l;
            C4361l c4361l = c9077l.purchase;
            C3183l c3183l = c9077l.billing;
            i2 = c9077l.mopub;
            if (i2 == 0) {
                i2 = C17427l.loadAd;
            }
            int i10 = i2;
            i3 = c9077l.admob;
            if (i3 == 0) {
                i4 = 1;
            } else {
                i4 = i3;
            }
            c10068l = c9077l.subs;
            if (c10068l == null) {
                c10068l = C10068l.crashlytics;
            }
            return new C11090l(c14264l2, new C9077l(i8, i, j, c13299l2, c4361l, c3183l, i10, i4, c10068l), c11090l.crashlytics);
        }
        int iOrdinal2 = enumC9931l.ordinal();
        if (iOrdinal2 == 0) {
            i7 = 4;
        } else if (iOrdinal2 != 1) {
            C18725l.billing();
            return null;
        }
        i = i7;
        j = c9077l.crashlytics;
        if ((j & 1095216660480L) == 0) {
            j = AbstractC6992l.yandex;
        }
        c13299l = c9077l.amazon;
        if (c13299l == null) {
            c13299l = C13299l.crashlytics;
        }
        C13299l c13299l3 = c13299l;
        C4361l c4361l2 = c9077l.purchase;
        C3183l c3183l2 = c9077l.billing;
        i2 = c9077l.mopub;
        if (i2 == 0) {
            i2 = C17427l.loadAd;
        }
        int i11 = i2;
        i3 = c9077l.admob;
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = i3;
        }
        c10068l = c9077l.subs;
        if (c10068l == null) {
            c10068l = C10068l.crashlytics;
        }
        return new C11090l(c14264l2, new C9077l(i8, i, j, c13299l3, c4361l2, c3183l2, i11, i4, c10068l), c11090l.crashlytics);
    }

    public static final C5197l loadAd() {
        C5197l c5197l = mopub;
        if (c5197l != null) {
            return c5197l;
        }
        C10943l c10943l = new C10943l("Rounded.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC8192l.yandex;
        C8990l c8990l = new C8990l(C9735l.loadAd);
        C15659l c15659l = new C15659l();
        c15659l.billing(5.0f, 13.0f);
        C0040l c0040l = new C0040l(11.17f);
        ArrayList arrayList = c15659l.f30611l;
        arrayList.add(c0040l);
        c15659l.purchase(-4.88f, 4.88f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        c15659l.loadAd(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c15659l.purchase(6.59f, -6.59f);
        c15659l.loadAd(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c15659l.purchase(-6.58f, -6.6f);
        c15659l.loadAd(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c15659l.loadAd(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c15659l.amazon(16.17f, 11.0f);
        c15659l.crashlytics(5.0f);
        c15659l.loadAd(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        c15659l.mopub(0.45f, 1.0f, 1.0f, 1.0f);
        c15659l.yandex();
        C10943l.yandex(c10943l, arrayList, c8990l);
        C5197l c5197lLoadAd = c10943l.loadAd();
        mopub = c5197lLoadAd;
        return c5197lLoadAd;
    }

    public static final C15900l purchase(InputStream inputStream) {
        return new C15900l(inputStream, new C3446l());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void yandex(InterfaceC9427l interfaceC9427l, Object obj, Object obj2, AbstractC0283l abstractC0283l) {
        C17596l c17596l;
        if (abstractC0283l instanceof C17596l) {
            c17596l = (C17596l) abstractC0283l;
            int i = c17596l.f34255l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17596l.f34255l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17596l = new C17596l(abstractC0283l);
            }
        } else {
            c17596l = new C17596l(abstractC0283l);
        }
        Object obj3 = c17596l.f34253l;
        int i2 = c17596l.f34255l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj3);
            c17596l.f34254l = obj2;
            c17596l.f34255l = 1;
            if (interfaceC9427l.isPro(obj, c17596l) == EnumC9342l.f19165l) {
                return;
            }
        } else if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = c17596l.f34254l;
            AbstractC2829l.crashlytics(obj3);
        }
        throw new Cinstanceof(obj2);
    }
}
