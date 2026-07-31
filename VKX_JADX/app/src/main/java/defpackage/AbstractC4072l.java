package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4072l implements InterfaceC17739l, InterfaceC0039l {
    public static final C15578l yandex = new C15578l(-464415949, false, new C2039l(25));
    public static final C15578l loadAd = new C15578l(1635322481, false, new C2039l(28));
    public static final C15578l crashlytics = new C15578l(1835636748, false, new C4832l(12));
    public static final C15578l amazon = new C15578l(-1409461333, false, new C4832l(1));
    public static final C15578l purchase = new C15578l(-1032213654, false, new C2039l(26));
    public static final C15578l billing = new C15578l(-1818211544, false, new C2039l(27));
    public static final C15578l mopub = new C15578l(1705238019, false, new C4832l(2));
    public static final C15578l admob = new C15578l(1312239074, false, new C4832l(3));
    public static final C15578l subs = new C15578l(2105355183, false, new C4832l(4));
    public static final C15578l isPro = new C15578l(-2093518000, false, new C4832l(5));
    public static final C15578l firebase = new C15578l(-1420667582, false, new C4832l(6));
    public static final C15578l smaato = new C15578l(-519010109, false, new C4832l(7));
    public static final C15578l remoteconfig = new C15578l(-222440416, false, new C4832l(8));
    public static final C15578l vip = new C15578l(62257739, false, new C2039l(0));
    public static final C15578l metrica = new C15578l(866250106, false, new C4832l(9));
    public static final C15578l startapp = new C15578l(-760339127, false, new C4832l(10));
    public static final C15578l adcel = new C15578l(751562240, false, new C4832l(11));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object Signature(C5374l c5374l, AbstractC0283l abstractC0283l) {
        C13943l c13943l;
        if (abstractC0283l instanceof C13943l) {
            c13943l = (C13943l) abstractC0283l;
            int i = c13943l.f27238l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13943l.f27238l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13943l = new C13943l(abstractC0283l);
            }
        } else {
            c13943l = new C13943l(abstractC0283l);
        }
        Object obj = c13943l.f27236l;
        int i2 = c13943l.f27238l;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 2;
        Object obj2 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c13943l.f27237l = c5374l;
            c13943l.f27238l = 1;
            Object objSmaato = AbstractC0622l.smaato((C7549l) c5374l.billing.purchase, new C2051l(i3, interfaceC14029l, 14), c13943l);
            if (objSmaato != obj2) {
                objSmaato = Unit.INSTANCE;
            }
            if (objSmaato != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c5374l = c13943l.f27237l;
        AbstractC2829l.crashlytics(obj);
        C7549l c7549l = (C7549l) c5374l.billing.admob;
        c13943l.f27237l = null;
        c13943l.f27238l = 2;
        Object objFirebase = AbstractC0622l.firebase(c7549l, c13943l);
        return objFirebase == obj2 ? obj2 : objFirebase;
    }

    public static final boolean inmobi(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return false;
        }
        if (activityManager.isLowRamDevice()) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem <= 2147483648L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (defpackage.AbstractC3105l.amazon(r11.getWidth(), r11.getHeight(), (int) (r2 >> 32), (int) (r2 & 4294967295L), r4, r20) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap license(android.graphics.drawable.Drawable r16, android.graphics.Bitmap.Config r17, defpackage.C9192l r18, int r19, defpackage.C9192l r20, boolean r21) {
        /*
            r0 = r16
            r1 = r18
            r4 = r19
            r5 = r20
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r2 == 0) goto L5d
            r2 = r0
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r11 = r2.getBitmap()
            android.graphics.Bitmap$Config r2 = r11.getConfig()
            if (r17 == 0) goto L2a
            boolean r3 = defpackage.AbstractC5941l.m1911throws(r17)
            if (r3 == 0) goto L27
            goto L2a
        L27:
            r3 = r17
            goto L2c
        L2a:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
        L2c:
            if (r2 != r3) goto L5d
            if (r21 == 0) goto L31
            goto L5c
        L31:
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            long r2 = defpackage.AbstractC3105l.crashlytics(r2, r3, r1, r4, r5)
            long r6 = r2 >> r10
            int r6 = (int) r6
            long r2 = r2 & r8
            int r2 = (int) r2
            r5 = r2
            int r2 = r11.getWidth()
            int r3 = r11.getHeight()
            r7 = r6
            r6 = r4
            r4 = r7
            r7 = r20
            double r2 = defpackage.AbstractC3105l.amazon(r2, r3, r4, r5, r6, r7)
            r4 = r6
            r5 = r7
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L5d
        L5c:
            return r11
        L5d:
            android.graphics.drawable.Drawable r6 = r0.mutate()
            int r0 = defpackage.AbstractC4032l.loadAd(r6)
            r2 = 512(0x200, float:7.17E-43)
            if (r0 <= 0) goto L6a
            goto L6b
        L6a:
            r0 = r2
        L6b:
            int r3 = defpackage.AbstractC4032l.yandex(r6)
            if (r3 <= 0) goto L72
            r2 = r3
        L72:
            long r11 = defpackage.AbstractC3105l.crashlytics(r0, r2, r1, r4, r5)
            long r13 = r11 >> r10
            int r1 = (int) r13
            long r8 = r8 & r11
            int r3 = (int) r8
            r15 = r2
            r2 = r1
            r1 = r15
            double r2 = defpackage.AbstractC3105l.amazon(r0, r1, r2, r3, r4, r5)
            double r4 = (double) r0
            double r4 = r4 * r2
            int r0 = defpackage.AbstractC5573l.adcel(r4)
            double r4 = (double) r1
            double r2 = r2 * r4
            int r1 = defpackage.AbstractC5573l.adcel(r2)
            if (r17 == 0) goto L9a
            boolean r2 = defpackage.AbstractC5941l.m1911throws(r17)
            if (r2 == 0) goto L97
            goto L9a
        L97:
            r2 = r17
            goto L9c
        L9a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L9c:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Rect r3 = r6.getBounds()
            int r4 = r3.left
            int r5 = r3.top
            int r7 = r3.right
            int r3 = r3.bottom
            r8 = 0
            r6.setBounds(r8, r8, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r2)
            r6.draw(r0)
            r6.setBounds(r4, r5, r7, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4072l.license(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, lٌۦً, int, lٌۦً, boolean):android.graphics.Bitmap");
    }

    public static final void pro(C5374l c5374l, VKXApplication vKXApplication, Function1 function1) {
        AbstractC10999l.mopub(vKXApplication, null, 0, new C17949l(function1, c5374l, null, 28), 3);
    }

    public void ad(InterfaceC18035l interfaceC18035l, int i, boolean z) {
        advert(interfaceC18035l, i);
        subs(z);
    }

    @Override // defpackage.InterfaceC17739l
    public abstract void adcel(long j);

    @Override // defpackage.InterfaceC17739l
    public abstract void admob(byte b);

    @Override // defpackage.InterfaceC0039l
    public /* bridge */ boolean ads() {
        return true;
    }

    public abstract void advert(InterfaceC18035l interfaceC18035l, int i);

    public void applovin(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        advert(interfaceC18035l, i);
        purchase(interfaceC16588l, obj);
    }

    public void appmetrica(InterfaceC18035l interfaceC18035l, int i, String str) {
        advert(interfaceC18035l, i);
        subscription(str);
    }

    @Override // defpackage.InterfaceC17739l
    public abstract void billing(double d);

    @Override // defpackage.InterfaceC17739l
    public abstract void firebase(float f);

    public InterfaceC17739l isVip(C4495l c4495l, int i) {
        advert(c4495l, i);
        return isPro(c4495l.isPro(i));
    }

    @Override // defpackage.InterfaceC17739l
    public abstract void metrica(int i);

    @Override // defpackage.InterfaceC17739l
    public abstract void mopub(short s);

    public void premium(InterfaceC18035l interfaceC18035l, int i, long j) {
        advert(interfaceC18035l, i);
        adcel(j);
    }

    @Override // defpackage.InterfaceC17739l
    public void purchase(InterfaceC16588l interfaceC16588l, Object obj) {
        interfaceC16588l.crashlytics(this, obj);
    }

    public void signatures(int i, int i2, InterfaceC18035l interfaceC18035l) {
        advert(interfaceC18035l, i);
        metrica(i2);
    }

    @Override // defpackage.InterfaceC17739l
    public abstract void smaato(char c);

    @Override // defpackage.InterfaceC0039l
    public void startapp(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        advert(interfaceC18035l, i);
        if (interfaceC16588l.purchase().crashlytics()) {
            purchase(interfaceC16588l, obj);
        } else if (obj == null) {
            amazon();
        } else {
            remoteconfig();
            purchase(interfaceC16588l, obj);
        }
    }

    @Override // defpackage.InterfaceC17739l
    public abstract void subs(boolean z);

    @Override // defpackage.InterfaceC17739l
    public abstract void subscription(String str);

    @Override // defpackage.InterfaceC17739l
    public InterfaceC0039l tapsense(InterfaceC18035l interfaceC18035l, int i) {
        return crashlytics(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC17739l
    public /* bridge */ void remoteconfig() {
    }

    @Override // defpackage.InterfaceC17739l
    public InterfaceC17739l isPro(InterfaceC18035l interfaceC18035l) {
        return this;
    }
}
