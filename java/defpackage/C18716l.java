package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۧؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18716l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ float f36475l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f36476l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36477l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36478l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18716l(C7473l c7473l, float f, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36476l = c7473l;
        this.f36475l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f36477l;
        Object obj2 = this.f36476l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                ScrollCaptureCallbackC6465l scrollCaptureCallbackC6465l = (ScrollCaptureCallbackC6465l) obj2;
                int i2 = this.f36478l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    float f = this.f36475l;
                    Object objMopub = scrollCaptureCallbackC6465l.yandex.amazon.f13225l.mopub(AbstractC16601l.purchase);
                    Function2 function2 = (Function2) (objMopub != null ? objMopub : null);
                    if (function2 == null) {
                        throw AbstractC5020l.metrica("Required value was null.");
                    }
                    C1187l c1187l = new C1187l((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                    this.f36478l = 1;
                    obj = function2.invoke(c1187l, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((C1187l) obj).yandex & 4294967295L)));
            default:
                int i3 = this.f36478l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7473l c7473l = (C7473l) obj2;
                    C16801l c16801l = c7473l.subs;
                    C14807l c14807l = new C14807l(c7473l, this.f36475l, null);
                    this.f36478l = 1;
                    if (C16801l.loadAd(c16801l, c14807l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f36477l;
        Object obj2 = this.f36476l;
        switch (i) {
            case 0:
                C18716l c18716l = new C18716l((ScrollCaptureCallbackC6465l) obj2, interfaceC14029l);
                c18716l.f36475l = ((Number) obj).floatValue();
                return c18716l;
            default:
                return new C18716l((C7473l) obj2, this.f36475l, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36477l) {
            case 0:
                return ((C18716l) ads((InterfaceC14029l) obj2, Float.valueOf(((Number) obj).floatValue()))).Signature(Unit.INSTANCE);
            default:
                return ((C18716l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18716l(ScrollCaptureCallbackC6465l scrollCaptureCallbackC6465l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36476l = scrollCaptureCallbackC6465l;
    }
}
