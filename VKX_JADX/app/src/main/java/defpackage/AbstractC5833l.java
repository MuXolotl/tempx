package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌؘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5833l {
    public static final StringBuilder yandex = new StringBuilder(48);

    public static final void admob(InterfaceC17865l interfaceC17865l, HashSet hashSet, C6956l c6956l, int i) {
        c6956l.m2133new(-290867539);
        if ((((c6956l.admob(interfaceC17865l) ? 4 : 2) | i | (c6956l.admob(hashSet) ? 32 : 16)) & 19) == 18 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2123default(647262698);
            boolean zBilling = c6956l.billing(interfaceC17865l);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            Object obj2 = objM2132native;
            if (zBilling || objM2132native == obj) {
                C18183l c18183l = new C18183l();
                c18183l.yandex = hashSet;
                c6956l.m2147try(c18183l);
                obj2 = c18183l;
            }
            Object obj3 = (C18183l) obj2;
            c6956l.startapp(false);
            c6956l.m2123default(647265340);
            boolean zAdmob = c6956l.admob(obj3) | c6956l.admob(hashSet) | c6956l.admob(interfaceC17865l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == obj) {
                objM2132native2 = new Ctransient(obj3, hashSet, interfaceC17865l, 10);
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            AbstractC12311l.yandex(interfaceC17865l, hashSet, (Function1) objM2132native2, c6956l);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(interfaceC17865l, hashSet, i, 13);
        }
    }

    public static final void amazon(View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Float.valueOf(0.0f).floatValue(), Float.valueOf(1.0f).floatValue());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new C4756l(view, 1));
        valueAnimatorOfFloat.start();
    }

    public static final void billing(C10685l c10685l, String str, Number number) {
    }

    public static final void crashlytics(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Float.valueOf(1.0f).floatValue(), Float.valueOf(0.0f).floatValue());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new C4756l(view, 0));
        valueAnimatorOfFloat.start();
    }

    public static final RectF firebase(C8896l c8896l) {
        return new RectF(c8896l.yandex, c8896l.loadAd, c8896l.crashlytics, c8896l.amazon);
    }

    public static final Rect isPro(C16918l c16918l) {
        return new Rect(c16918l.yandex, c16918l.loadAd, c16918l.crashlytics, c16918l.amazon);
    }

    public static final void loadAd(C10853l c10853l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(100558968);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c10853l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(null) : c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            C8874l c8874lMopub = AbstractC1896l.mopub(c6956l);
            C1028l c1028l = c10853l.crashlytics;
            HashSet hashSet = new HashSet();
            Iterator it = c1028l.iterator();
            while (it.hasNext()) {
                hashSet.add(((AbstractC5357l) it.next()).crashlytics());
            }
            int i3 = 0;
            admob(c8874lMopub, hashSet, c6956l, 0);
            C1686l c1686l = (C1686l) c6956l.isPro(AbstractC4860l.yandex);
            c6956l.m2123default(1543417698);
            c6956l.m2123default(1543418101);
            boolean zBilling = c6956l.billing(c1686l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                c1686l.getClass();
                c6956l.m2147try(null);
            } else {
                obj = objM2132native;
            }
            c6956l.startapp(false);
            c6956l.startapp(false);
            C15578l c15578lAmazon = AbstractC14566l.amazon(-1548770973, new C13147l(c8874lMopub, c15578l, i3), c6956l);
            c6956l.m2123default(1800734984);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            C6415l c6415l = C3438l.isPro;
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(i4))) {
                c6956l.m2147try(Integer.valueOf(i4));
                c6956l.loadAd(Integer.valueOf(i4), c6415l);
            }
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c15578lAmazon.invoke(c10853l.yandex, c6956l, 48);
            c6956l.startapp(true);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(c10853l, interfaceC17242l, c15578l, i, 7);
        }
    }

    public static final void mopub(C10685l c10685l, String str, String str2) {
    }

    public static final void purchase(View view) {
        try {
            view.setVisibility(8);
        } catch (NullPointerException unused) {
        }
    }

    public static final C8896l remoteconfig(RectF rectF) {
        return new C8896l(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final C8896l smaato(Rect rect) {
        return new C8896l(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void subs(View view) {
        try {
            view.setVisibility(0);
        } catch (NullPointerException unused) {
        }
    }

    public static final void yandex(C11919l c11919l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        c6956l.m2133new(669199561);
        int i4 = (c6956l.admob(c11919l) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        }
        int i6 = i3 | 384;
        if ((i6 & 1171) == 1170 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            if (i5 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            loadAd((C10853l) AbstractC9637l.purchase(c11919l, c6956l, i6 & 14).getValue(), interfaceC17242l, c15578l, c6956l, i6 & 8176);
        }
        InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(i, i2, 6, c11919l, interfaceC17242l2, c15578l);
        }
    }
}
