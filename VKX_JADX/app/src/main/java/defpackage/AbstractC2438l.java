package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2438l {
    public static final C15578l yandex = new C15578l(1804580996, false, new C5974l(0));
    public static final C15578l loadAd = new C15578l(1656891506, false, new C5974l(1));
    public static final C15578l crashlytics = new C15578l(1119391541, false, new C5974l(2));
    public static final C15578l amazon = new C15578l(460325460, false, new C5974l(3));
    public static final C15578l purchase = new C15578l(-632378505, false, new C11891l(9));

    public static final C18656l admob(C14783l c14783l, String str, C6956l c6956l, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && c6956l.billing(c14783l)) || (i & 6) == 4;
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (z || objM2132native == obj) {
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                Object c18656l = new C18656l(c14783l, null, str);
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                c6956l.m2147try(c18656l);
                objM2132native = c18656l;
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        }
        C18656l c18656l2 = (C18656l) objM2132native;
        c6956l.m2123default(-1356348972);
        c18656l2.yandex(c14783l.crashlytics.getValue(), c6956l, 0);
        c6956l.startapp(false);
        boolean zBilling = c6956l.billing(c18656l2);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj) {
            objM2132native2 = new C12836l(c18656l2, i3);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c18656l2, (Function1) objM2132native2, c6956l);
        return c18656l2;
    }

    public static final C18656l amazon(C18656l c18656l, Object obj, Object obj2, String str, C6956l c6956l, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && c6956l.billing(c18656l)) || (i & 6) == 4;
        Object objM2132native = c6956l.m2132native();
        Object obj3 = C1867l.yandex;
        if (z2 || objM2132native == obj3) {
            objM2132native = new C18656l(new C14783l(obj), c18656l, AbstractC9361l.pro(c18656l.crashlytics, " > ", str));
            c6956l.m2147try(objM2132native);
        }
        C18656l c18656l2 = (C18656l) objM2132native;
        if ((i2 <= 4 || !c6956l.billing(c18656l)) && (i & 6) != 4) {
            z = false;
        }
        boolean zBilling = c6956l.billing(c18656l2) | z;
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj3) {
            objM2132native2 = new C10207l(c18656l, c18656l2, 28);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c18656l2, (Function1) objM2132native2, c6956l);
        if (c18656l.mopub()) {
            c18656l2.isPro(obj, obj2);
            return c18656l2;
        }
        c18656l2.firebase(obj2);
        c18656l2.smaato.setValue(Boolean.FALSE);
        return c18656l2;
    }

    public static final C9459l billing(C18656l c18656l, Object obj, Object obj2, InterfaceC17807l interfaceC17807l, C0010l c0010l, C6956l c6956l, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && c6956l.billing(c18656l)) || (i & 6) == 4;
        Object objM2132native = c6956l.m2132native();
        Object obj5 = C1867l.yandex;
        if (z2 || objM2132native == obj5) {
            AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
            Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
            AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
            try {
                obj3 = obj2;
                AbstractC2249l abstractC2249l = (AbstractC2249l) c0010l.yandex.invoke(obj3);
                abstractC2249l.amazon();
                obj4 = obj;
                Object c9459l = new C9459l(c18656l, obj4, abstractC2249l, c0010l);
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                c6956l.m2147try(c9459l);
                objM2132native = c9459l;
            } catch (Throwable th) {
                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        C9459l c9459l2 = (C9459l) objM2132native;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        yandex(c18656l, c9459l2, obj4, obj3, interfaceC17807l, c6956l, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !c6956l.billing(c18656l)) && (i & 6) != 4) {
            z = false;
        }
        boolean zBilling = c6956l.billing(c9459l2) | z;
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj5) {
            objM2132native2 = new C10207l(c18656l, c9459l2, 27);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c9459l2, (Function1) objM2132native2, c6956l);
        return c9459l2;
    }

    public static long crashlytics(int i, long j, long j2) {
        long j3 = j2 & ((j >>> i) ^ j);
        return j ^ (j3 ^ (j3 << i));
    }

    public static final C18656l isPro(Object obj, String str, C6956l c6956l, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            objM2132native = new C18656l(new C14783l(obj), null, str);
            c6956l.m2147try(objM2132native);
        }
        C18656l c18656l = (C18656l) objM2132native;
        c18656l.yandex(obj, c6956l, (i & 8) | 48 | (i & 14));
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == c13863l) {
            objM2132native2 = new C12836l(c18656l, 1);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c18656l, (Function1) objM2132native2, c6956l);
        return c18656l;
    }

    public static int loadAd(int i, int i2, int i3) {
        int i4 = i2 & ((i >>> i3) ^ i);
        return i ^ (i4 ^ (i4 << i3));
    }

    public static final Rect mopub(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC11880l.ad(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11880l.ad(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final C15738l purchase(C18656l c18656l, C0010l c0010l, String str, C6956l c6956l, int i, int i2) {
        C17421l c17421l;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zBilling = c6956l.billing(c18656l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C15738l(c18656l, c0010l, str);
            c6956l.m2147try(objM2132native);
        }
        C15738l c15738l = (C15738l) objM2132native;
        boolean zBilling2 = c6956l.billing(c18656l) | c6956l.admob(c15738l);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling2 || objM2132native2 == obj) {
            objM2132native2 = new C10207l(c18656l, c15738l, 29);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c15738l, (Function1) objM2132native2, c6956l);
        if (c18656l.mopub() && (c17421l = (C17421l) c15738l.loadAd.getValue()) != null) {
            C18656l c18656l2 = c15738l.crashlytics;
            c17421l.f33958l.mopub(c17421l.f33956l.invoke(c18656l2.billing().loadAd()), c17421l.f33956l.invoke(c18656l2.billing().amazon()), (InterfaceC17807l) c17421l.f33957l.invoke(c18656l2.billing()));
        }
        return c15738l;
    }

    public static final Object subs(Context context, C15656l c15656l, C3445l c3445l, Function2 function2, AbstractC0283l abstractC0283l) {
        if (c3445l instanceof C3445l) {
            return C18188l.yandex.amazon(context, c15656l, AbstractC13743l.crashlytics(c3445l.yandex), function2, abstractC0283l);
        }
        C8339l.metrica("The glance ID is not the one of an App Widget");
        return null;
    }

    public static final void yandex(C18656l c18656l, C9459l c9459l, Object obj, Object obj2, InterfaceC17807l interfaceC17807l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(867041821);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(c18656l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(c9459l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(obj) : c6956l.admob(obj) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c6956l.billing(obj2) : c6956l.admob(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? c6956l.billing(interfaceC17807l) : c6956l.admob(interfaceC17807l) ? 16384 : 8192;
        }
        if (!c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            c6956l.m2124else();
        } else if (c18656l.mopub()) {
            c9459l.mopub(obj, obj2, interfaceC17807l);
        } else {
            c9459l.admob(obj2, interfaceC17807l, null, null);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(c18656l, c9459l, obj, obj2, interfaceC17807l, i, 7);
        }
    }
}
