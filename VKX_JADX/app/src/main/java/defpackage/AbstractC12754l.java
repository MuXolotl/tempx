package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘّٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12754l {
    public static final C15578l yandex = new C15578l(1205107154, false, new C4832l(0));

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(C5374l c5374l, AbstractC0283l abstractC0283l) throws Throwable {
        C0057l c0057l;
        C0129l c0129l;
        C5374l c5374l2;
        Object obj;
        long j;
        C7644l c7644l;
        if (abstractC0283l instanceof C0057l) {
            c0057l = (C0057l) abstractC0283l;
            int i = c0057l.f952l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0057l.f952l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0057l = new C0057l(abstractC0283l);
            }
        } else {
            c0057l = new C0057l(abstractC0283l);
        }
        Object objCrashlytics = c0057l.f955l;
        int i2 = c0057l.f952l;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            C5374l c5374l3 = c5374l.crashlytics;
            c0057l.f954l = c5374l;
            c0057l.f952l = 1;
            objCrashlytics = AbstractC17780l.crashlytics(c5374l3, c0057l);
            if (objCrashlytics != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            c5374l = c0057l.f954l;
            AbstractC2829l.crashlytics(objCrashlytics);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0129l = c0057l.f953l;
            c5374l2 = c0057l.f954l;
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        if (((Boolean) objCrashlytics).booleanValue()) {
            c5374l2.getClass();
            obj = c0129l.yandex;
            j = ((C5492l) obj).loadAd;
            c7644l = VKXApplication.f36633l;
            if (c7644l == null) {
                c7644l = null;
            }
            if (j == ((C4645l) c7644l.f15735l).yandex) {
                C0129l.Companion.serializer(C5492l.Companion.serializer()).crashlytics(new C0901l(c5374l2.purchase, AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}), AbstractC10651l.yandex), new C0129l(obj, c0129l.loadAd));
                return obj;
            }
        }
        AbstractC3483l.mopub(c5374l2.purchase, C0129l.Companion.serializer(C5492l.Companion.serializer()), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}));
        AbstractC0775l.m673package(c5374l2.purchase);
        return null;
        C5374l c5374l4 = c5374l;
        c0129l = (C0129l) objCrashlytics;
        C5492l c5492l = (C5492l) c0129l.yandex;
        String str = c0129l.loadAd;
        c0057l.f954l = c5374l4;
        c0057l.f953l = c0129l;
        c0057l.f952l = 2;
        C16552l c16552l = AbstractC11463l.yandex;
        objCrashlytics = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C17949l(c5374l4, c5492l, str, interfaceC14029l, 27), c0057l);
        if (objCrashlytics != enumC9342l) {
            c5374l2 = c5374l4;
            if (((Boolean) objCrashlytics).booleanValue()) {
                c5374l2.getClass();
                obj = c0129l.yandex;
                j = ((C5492l) obj).loadAd;
                c7644l = VKXApplication.f36633l;
                if (c7644l == null) {
                    c7644l = null;
                }
                if (j == ((C4645l) c7644l.f15735l).yandex) {
                    C0129l.Companion.serializer(C5492l.Companion.serializer()).crashlytics(new C0901l(c5374l2.purchase, AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}), AbstractC10651l.yandex), new C0129l(obj, c0129l.loadAd));
                    return obj;
                }
            }
            AbstractC3483l.mopub(c5374l2.purchase, C0129l.Companion.serializer(C5492l.Companion.serializer()), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}));
            AbstractC0775l.m673package(c5374l2.purchase);
            return null;
        }
        return enumC9342l;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object billing(C5374l c5374l, AbstractC0283l abstractC0283l) {
        C12444l c12444l;
        C0129l c0129l;
        Object obj;
        C5374l c5374l2;
        if (abstractC0283l instanceof C12444l) {
            c12444l = (C12444l) abstractC0283l;
            int i = c12444l.f24559l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12444l.f24559l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12444l = new C12444l(abstractC0283l);
            }
        } else {
            c12444l = new C12444l(abstractC0283l);
        }
        Object obj2 = c12444l.f24562l;
        int i2 = c12444l.f24559l;
        byte b = 0;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            c0129l = (C0129l) AbstractC3483l.crashlytics(c5374l.purchase, C0129l.Companion.serializer(C5492l.Companion.serializer()), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}), AbstractC10651l.yandex);
            if (c0129l != null) {
                C5492l c5492l = (C5492l) c0129l.yandex;
                String str = c0129l.loadAd;
                c12444l.f24561l = c5374l;
                c12444l.f24560l = c0129l;
                c12444l.f24559l = 1;
                C16552l c16552l = AbstractC11463l.yandex;
                Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C17949l(c5374l, c5492l, str, b == true ? 1 : 0, 27), c12444l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
                obj = objFirebase;
                c5374l2 = c5374l;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C0129l c0129l2 = c12444l.f24560l;
        C5374l c5374l3 = c12444l.f24561l;
        AbstractC2829l.crashlytics(obj2);
        c0129l = c0129l2;
        c5374l2 = c5374l3;
        obj = obj2;
        if (((Boolean) obj).booleanValue()) {
            c5374l2.getClass();
            Object obj3 = c0129l.yandex;
            long j = ((C5492l) obj3).loadAd;
            C7644l c7644l = VKXApplication.f36633l;
            if (j == ((C4645l) (c7644l != null ? c7644l : null).f15735l).yandex) {
                C14169l c14169l = c5374l2.billing;
                C1008l c1008l = (C1008l) c14169l.loadAd;
                c1008l.smaato((C5492l) obj3);
                if (c1008l.getValue() != null) {
                    c14169l.loadAd(C2675l.yandex);
                }
            } else {
                AbstractC3483l.mopub(c5374l2.purchase, C0129l.Companion.serializer(C5492l.Companion.serializer()), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}));
                AbstractC0775l.m673package(c5374l2.purchase);
            }
        } else {
            AbstractC3483l.mopub(c5374l2.purchase, C0129l.Companion.serializer(C5492l.Companion.serializer()), AbstractC16648l.ads(new byte[]{115, 112, 97, 114, 107, 46, 97, 99, 99, 111, 117, 110, 116}));
            AbstractC0775l.m673package(c5374l2.purchase);
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ Drawable purchase(Drawable drawable, Context context, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static C12876l yandex(AbstractC0019l abstractC0019l) {
        if (abstractC0019l instanceof C0166l) {
            C0166l c0166l = (C0166l) abstractC0019l;
            return new C12876l(c0166l.loadAd.concat(c0166l.crashlytics));
        }
        if (abstractC0019l instanceof C10728l) {
            C10728l c10728l = (C10728l) abstractC0019l;
            return new C12876l(AbstractC11043l.admob('#', c10728l.loadAd, c10728l.crashlytics));
        }
        C18725l.billing();
        return null;
    }

    public abstract AbstractC8859l crashlytics(AbstractC8859l abstractC8859l, BigInteger bigInteger);

    public AbstractC8859l loadAd(AbstractC8859l abstractC8859l, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || abstractC8859l.smaato()) {
            return abstractC8859l.yandex.remoteconfig();
        }
        AbstractC8859l abstractC8859lCrashlytics = crashlytics(abstractC8859l, bigInteger.abs());
        if (iSignum <= 0) {
            abstractC8859lCrashlytics = abstractC8859lCrashlytics.metrica();
        }
        AbstractC6974l.admob(abstractC8859lCrashlytics);
        return abstractC8859lCrashlytics;
    }
}
