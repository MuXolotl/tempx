package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4840l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Matrix f9882l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0059l f9883l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f9884l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Rect f9885l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C10712l f9886l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C9950l f9887l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Context f9888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4840l(Rect rect, Matrix matrix, C9950l c9950l, C10712l c10712l, Context context, C0059l c0059l, InterfaceC8714l interfaceC8714l) {
        super(1);
        this.f9885l = rect;
        this.f9882l = matrix;
        this.f9887l = c9950l;
        this.f9886l = c10712l;
        this.f9888l = context;
        this.f9883l = c0059l;
        this.f9884l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
        InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
        Rect rect = this.f9885l;
        long jYandex = AbstractC8532l.yandex(rect.width(), rect.height());
        long jLoadAd = AbstractC14707l.loadAd(AbstractC5573l.ads(C14174l.billing(interfaceC13349l.admob())), AbstractC5573l.ads(C14174l.crashlytics(interfaceC13349l.admob())));
        float fYandex = AbstractC8513l.yandex(jYandex, interfaceC13349l.admob());
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fYandex)) << 32) | (((long) Float.floatToRawIntBits(fYandex)) & 4294967295L);
        int i = AbstractC7789l.yandex;
        float fBilling = C14174l.billing(jYandex);
        int i2 = AbstractC7789l.yandex;
        int i3 = (int) (jFloatToRawIntBits >> 32);
        int i4 = (int) (jFloatToRawIntBits & 4294967295L);
        long jLoadAd2 = AbstractC14707l.loadAd((int) (Float.intBitsToFloat(i3) * fBilling), (int) (Float.intBitsToFloat(i4) * C14174l.crashlytics(jYandex)));
        long jRound = (((long) Math.round(((interfaceC13349l.getLayoutDirection() == EnumC9931l.f20223l ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jLoadAd >> 32)) - ((int) (jLoadAd2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jLoadAd & 4294967295L)) - ((int) (jLoadAd2 & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.f9882l;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4));
        C9950l c9950l = this.f9887l;
        C15053l c15053l = c9950l.f20282l;
        ChoreographerFrameCallbackC7080l choreographerFrameCallbackC7080l = c9950l.f20286l;
        boolean zRemove = ((HashSet) c15053l.f29576l).remove(EnumC17795l.f34660l);
        if (c9950l.f20287l != null && zRemove) {
            c9950l.loadAd();
        }
        c9950l.f20296l = true;
        c9950l.f20304l = 1;
        c9950l.crashlytics();
        c9950l.f20284l = 1;
        ArrayList arrayList = c9950l.f20295l;
        C10712l c10712l = c9950l.f20287l;
        C10712l c10712l2 = this.f9886l;
        if (c10712l != c10712l2) {
            c9950l.f20275l = true;
            if (choreographerFrameCallbackC7080l.f14832l) {
                choreographerFrameCallbackC7080l.cancel();
                if (!c9950l.isVisible()) {
                    c9950l.f20274l = 1;
                }
            }
            c9950l.f20287l = null;
            c9950l.f20293l = null;
            c9950l.f20302l = null;
            c9950l.f20300l = -3.4028235E38f;
            choreographerFrameCallbackC7080l.f14838l = null;
            choreographerFrameCallbackC7080l.f14835l = -2.1474836E9f;
            choreographerFrameCallbackC7080l.f14841l = 2.1474836E9f;
            c9950l.invalidateSelf();
            c9950l.f20287l = c10712l2;
            c9950l.loadAd();
            boolean z = choreographerFrameCallbackC7080l.f14838l == null;
            choreographerFrameCallbackC7080l.f14838l = c10712l2;
            if (z) {
                choreographerFrameCallbackC7080l.firebase(Math.max(choreographerFrameCallbackC7080l.f14835l, c10712l2.smaato), Math.min(choreographerFrameCallbackC7080l.f14841l, c10712l2.remoteconfig));
            } else {
                choreographerFrameCallbackC7080l.firebase((int) c10712l2.smaato, (int) c10712l2.remoteconfig);
            }
            float f = choreographerFrameCallbackC7080l.f14834l;
            choreographerFrameCallbackC7080l.f14834l = 0.0f;
            choreographerFrameCallbackC7080l.f14833l = 0.0f;
            choreographerFrameCallbackC7080l.isPro((int) f);
            choreographerFrameCallbackC7080l.crashlytics();
            c9950l.remoteconfig(choreographerFrameCallbackC7080l.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC16652l interfaceC16652l = (InterfaceC16652l) it.next();
                if (interfaceC16652l != null) {
                    interfaceC16652l.run();
                }
                it.remove();
            }
            arrayList.clear();
            c10712l2.yandex.getClass();
            c9950l.crashlytics();
            Drawable.Callback callback = c9950l.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c9950l);
            }
        }
        if (this.f9884l.getValue() != null) {
            C18725l.loadAd();
            return null;
        }
        c9950l.f20299l = true;
        if (true != c9950l.f20301l) {
            c9950l.f20301l = true;
            C13156l c13156l = c9950l.f20293l;
            if (c13156l != null) {
                c13156l.f25767volatile = true;
            }
            c9950l.invalidateSelf();
        }
        C13714l c13714lMopub = c9950l.mopub();
        if (c9950l.yandex(this.f9888l) || c13714lMopub == null) {
            c9950l.remoteconfig(((Number) this.f9883l.get()).floatValue());
        } else {
            c9950l.remoteconfig(c13714lMopub.loadAd);
        }
        c9950l.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvas = AbstractC10071l.yandex;
        Canvas canvas2 = ((C2151l) interfaceC14859lM4555synchronized).yandex;
        RunnableC10838l runnableC10838l = c9950l.f20290l;
        ThreadPoolExecutor threadPoolExecutor = C9950l.f20271l;
        Semaphore semaphore = c9950l.f20291l;
        C13156l c13156l2 = c9950l.f20293l;
        C10712l c10712l3 = c9950l.f20287l;
        if (c13156l2 != null && c10712l3 != null) {
            int i5 = c9950l.f20284l;
            if (i5 == 0) {
                i5 = 1;
            }
            boolean z2 = i5 == 2;
            if (z2) {
                try {
                    semaphore.acquire();
                    if (c9950l.vip()) {
                        c9950l.remoteconfig(choreographerFrameCallbackC7080l.amazon());
                    }
                } catch (InterruptedException unused) {
                    if (z2) {
                        semaphore.release();
                        if (c13156l2.f25764strictfp != choreographerFrameCallbackC7080l.amazon()) {
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    if (z2) {
                        semaphore.release();
                        if (c13156l2.f25764strictfp != choreographerFrameCallbackC7080l.amazon()) {
                            threadPoolExecutor.execute(runnableC10838l);
                        }
                    }
                    throw th;
                }
            }
            boolean z3 = c9950l.f20296l;
            int i6 = c9950l.f20303l;
            boolean z4 = c9950l.f20277l;
            if (z3) {
                try {
                    if (z4) {
                        canvas2.save();
                        canvas2.concat(matrix);
                        c9950l.isPro(canvas2, c13156l2);
                        canvas2.restore();
                    } else {
                        c13156l2.billing(canvas2, matrix, i6, null);
                    }
                } catch (Throwable unused2) {
                    AbstractC17968l.yandex.getClass();
                }
            } else if (z4) {
                canvas2.save();
                canvas2.concat(matrix);
                c9950l.isPro(canvas2, c13156l2);
                canvas2.restore();
            } else {
                c13156l2.billing(canvas2, matrix, i6, null);
            }
            c9950l.f20275l = false;
            if (z2) {
                semaphore.release();
                if (c13156l2.f25764strictfp != choreographerFrameCallbackC7080l.amazon()) {
                    threadPoolExecutor.execute(runnableC10838l);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
