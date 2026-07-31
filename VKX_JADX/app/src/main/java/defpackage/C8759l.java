package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8759l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f18034l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12866l f18035l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int[] f18036l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18037l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Context f18038l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18039l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8759l(AbstractC12866l abstractC12866l, Context context, int[] iArr, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18037l = i;
        this.f18035l = abstractC12866l;
        this.f18038l = context;
        this.f18036l = iArr;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f18037l;
        int[] iArr = this.f18036l;
        Context context = this.f18038l;
        AbstractC12866l abstractC12866l = this.f18035l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f18039l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f18034l;
                    this.f18039l = 1;
                    if (abstractC12866l.yandex(interfaceC2262l, context, iArr, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f18039l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f18034l;
                    this.f18039l = 1;
                    if (abstractC12866l.amazon(interfaceC2262l2, context, iArr, this) == enumC9342l) {
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
        switch (this.f18037l) {
            case 0:
                C8759l c8759l = new C8759l(this.f18035l, this.f18038l, this.f18036l, interfaceC14029l, 0);
                c8759l.f18034l = obj;
                return c8759l;
            default:
                C8759l c8759l2 = new C8759l(this.f18035l, this.f18038l, this.f18036l, interfaceC14029l, 1);
                c8759l2.f18034l = obj;
                return c8759l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18037l) {
            case 0:
                break;
        }
        return ((C8759l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
