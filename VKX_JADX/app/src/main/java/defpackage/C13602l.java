package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13602l {
    public static final C10685l crashlytics;
    public static final C13161l loadAd;
    public static final C13602l yandex = new C13602l();

    static {
        C16990l c16990l = new C16990l();
        c16990l.yandex(AbstractC18358l.amazon, new C18334l(15));
        c16990l.yandex(C3422l.f7275l, new C17049l(16));
        Unit unit = Unit.INSTANCE;
        Function1 function1 = (Function1) c16990l.f33122l;
        C4708l c4708l = new C4708l();
        c4708l.yandex = new C1306l(14);
        c4708l.crashlytics = 10;
        function1.invoke(c4708l);
        loadAd = new C13161l(new C16864l(new C2885l(c4708l), c16990l, true));
        crashlytics = new C10685l(15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(AbstractC18643l abstractC18643l, AbstractC0283l abstractC0283l) {
        C15182l c15182l;
        if (abstractC0283l instanceof C15182l) {
            c15182l = (C15182l) abstractC0283l;
            int i = c15182l.f29769l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15182l.f29769l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15182l = new C15182l(this, abstractC0283l);
            }
        } else {
            c15182l = new C15182l(this, abstractC0283l);
        }
        Object objYandex = c15182l.f29770l;
        int i2 = c15182l.f29769l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            c15182l.f29771l = this;
            c15182l.f29769l = 1;
            objYandex = yandex(abstractC18643l, null, c15182l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c15182l.f29771l;
            AbstractC2829l.crashlytics(objYandex);
        }
        InterfaceC0582l interfaceC0582l = (InterfaceC0582l) objYandex;
        this.getClass();
        if (interfaceC0582l instanceof C6143l) {
            return ((C6143l) interfaceC0582l).yandex;
        }
        if (!(interfaceC0582l instanceof C16016l)) {
            return null;
        }
        List list = ((C16016l) interfaceC0582l).yandex;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C11054l) {
                arrayList.add(obj);
            }
        }
        return AbstractC16901l.m4210case(arrayList, "\n", null, null, new C18334l(16), 30);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098 A[PHI: r7 r8
  0x0098: PHI (r7v21 java.lang.Object) = (r7v16 java.lang.Object), (r7v1 java.lang.Object) binds: [B:46:0x0095, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r8v4 lۡۨ) = (r8v2 lۡۨ), (r8v9 lۡۨ) binds: [B:46:0x0095, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r7 == r6) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object yandex(defpackage.AbstractC18643l r8, defpackage.EnumC12999l r9, defpackage.AbstractC0283l r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13602l.yandex(lۡۨ, lّۦٟ, lّؑۧ):java.lang.Object");
    }
}
