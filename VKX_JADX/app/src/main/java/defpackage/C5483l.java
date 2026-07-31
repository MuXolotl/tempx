package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5483l implements InterfaceC3773l {
    public final boolean crashlytics;
    public final C15106l loadAd;
    public final InterfaceC7204l yandex;

    public C5483l(InterfaceC7204l interfaceC7204l, C15106l c15106l, boolean z) {
        this.yandex = interfaceC7204l;
        this.loadAd = c15106l;
        this.crashlytics = z;
    }

    public static Drawable loadAd(C5483l c5483l, C9122l c9122l) {
        InterfaceC7204l interfaceC7204lAmazon = AbstractC7837l.amazon(c5483l.yandex, c5483l.crashlytics);
        try {
            ImageDecoder.Source sourceM3273continue = AbstractC11880l.m3273continue(interfaceC7204lAmazon, c5483l.loadAd, true);
            if (sourceM3273continue == null) {
                InterfaceC9473l interfaceC9473lMo2151l = interfaceC7204lAmazon.mo2151l();
                try {
                    interfaceC9473lMo2151l.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) interfaceC9473lMo2151l.crashlytics().f2526l);
                    while (!interfaceC9473lMo2151l.crashlytics().subs()) {
                        interfaceC9473lMo2151l.crashlytics().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    interfaceC9473lMo2151l.close();
                    sourceM3273continue = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC7876l.loadAd(interfaceC9473lMo2151l, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceM3273continue, new C3463l(c5483l, c9122l, 0));
            AbstractC1214l.yandex(interfaceC7204lAmazon, null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC1214l.yandex(interfaceC7204lAmazon, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(Drawable drawable, AbstractC0283l abstractC0283l) throws Throwable {
        C4600l c4600l;
        if (abstractC0283l instanceof C4600l) {
            c4600l = (C4600l) abstractC0283l;
            int i = c4600l.f9341l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4600l.f9341l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4600l = new C4600l(this, abstractC0283l);
            }
        } else {
            c4600l = new C4600l(this, abstractC0283l);
        }
        Object obj = c4600l.f9342l;
        int i2 = c4600l.f9341l;
        C15106l c15106l = this.loadAd;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            C16543l c16543l = AbstractC11114l.yandex;
            if (((Number) AbstractC0532l.amazon(c15106l, c16543l)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) AbstractC0532l.amazon(c15106l, c16543l)).intValue());
            }
            Function0 function0 = (Function0) AbstractC0532l.amazon(c15106l, AbstractC11114l.crashlytics);
            Function0 function1 = (Function0) AbstractC0532l.amazon(c15106l, AbstractC11114l.amazon);
            if (function0 != null || function1 != null) {
                C16552l c16552l = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex.f6462l;
                C13946l c13946l = new C13946l(drawable, function0, function1, null);
                c4600l.f9343l = drawable;
                c4600l.f9341l = 1;
                Object objFirebase = AbstractC10999l.firebase(c2975l, c13946l, c4600l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            drawable = (Drawable) c4600l.f9343l;
            AbstractC2829l.crashlytics(obj);
        }
        return new C18540l(drawable, c15106l.crashlytics);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3773l
    public final Object yandex(InterfaceC14029l interfaceC14029l) throws Throwable {
        C4547l c4547l;
        C9122l c9122l;
        Object objFirebase;
        C9122l c9122l2;
        if (interfaceC14029l instanceof C4547l) {
            c4547l = (C4547l) interfaceC14029l;
            int i = c4547l.f9192l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4547l.f9192l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4547l = new C4547l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c4547l = new C4547l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c4547l.f9193l;
        int i2 = c4547l.f9192l;
        InterfaceC14029l interfaceC14029l2 = null;
        Object obj2 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c9122l = new C9122l();
            Ctry ctry = new Ctry(this, c9122l, 7);
            c4547l.f9194l = c9122l;
            c4547l.f9192l = 1;
            objFirebase = AbstractC10999l.firebase(C17218l.f33421l, new C13624l(ctry, interfaceC14029l2, 24), c4547l);
            if (objFirebase != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            C9122l c9122l3 = c4547l.f9194l;
            AbstractC2829l.crashlytics(obj);
            objFirebase = obj;
            c9122l = c9122l3;
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9122l2 = c4547l.f9194l;
            AbstractC2829l.crashlytics(obj);
        }
        return new C9969l(AbstractC3230l.crashlytics((Drawable) obj), c9122l2.f18750l);
        c4547l.f9194l = c9122l;
        c4547l.f9192l = 2;
        Object objCrashlytics = crashlytics((Drawable) objFirebase, c4547l);
        if (objCrashlytics != obj2) {
            C9122l c9122l4 = c9122l;
            obj = objCrashlytics;
            c9122l2 = c9122l4;
            return new C9969l(AbstractC3230l.crashlytics((Drawable) obj), c9122l2.f18750l);
        }
        return obj2;
    }
}
