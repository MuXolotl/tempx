package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖۛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4394l extends C1274l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function2 f8924l;

    public C4394l(Function2 function2, InterfaceC12932l interfaceC12932l, int i, int i2) {
        super(function2, interfaceC12932l, i, i2, 0);
        this.f8924l = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.C1274l, defpackage.AbstractC18135l
    public final Object amazon(C12428l c12428l, InterfaceC14029l interfaceC14029l) {
        C2334l c2334l;
        if (interfaceC14029l instanceof C2334l) {
            c2334l = (C2334l) interfaceC14029l;
            int i = c2334l.f5058l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2334l.f5058l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2334l = new C2334l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c2334l = new C2334l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object obj = c2334l.f5059l;
        int i2 = c2334l.f5058l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c2334l.f5060l = c12428l;
            c2334l.f5058l = 1;
            Object objAmazon = super.amazon(c12428l, c2334l);
            Object obj2 = EnumC9342l.f19165l;
            if (objAmazon == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c12428l = c2334l.f5060l;
            AbstractC2829l.crashlytics(obj);
        }
        if (c12428l.f24537l.applovin()) {
            return Unit.INSTANCE;
        }
        C8339l.smaato("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.C1274l, defpackage.AbstractC18135l
    public final AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return new C4394l(this.f8924l, interfaceC12932l, i, i2);
    }
}
