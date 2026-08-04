package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٖۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16733l {
    public static final String yandex = C14513l.applovin("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(C14637l c14637l, C7718l c7718l, AbstractC0283l abstractC0283l) {
        C8823l c8823l;
        if (abstractC0283l instanceof C8823l) {
            c8823l = (C8823l) abstractC0283l;
            int i = c8823l.f18115l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8823l.f18115l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8823l = new C8823l(abstractC0283l);
            }
        } else {
            c8823l = new C8823l(abstractC0283l);
        }
        Object objFirebase = c8823l.f18116l;
        int i2 = c8823l.f18115l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C14970l c14970l = new C14970l(1, new C2347l(c14637l.mopub(c7718l), new C14951l(c7718l, interfaceC14029l, 14), 2));
            c8823l.f18115l = 1;
            objFirebase = AbstractC0622l.firebase(c14970l, c8823l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return new Integer(((C7685l) objFirebase).yandex);
    }
}
