package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17680l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9426l f34461l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34462l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34463l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17680l(C9426l c9426l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34462l = i;
        this.f34461l = c9426l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f34462l;
        C9426l c9426l = this.f34461l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f34463l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f34463l = 1;
                    if (c9426l.firebase(this) == enumC9342l) {
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
            case 1:
                int i3 = this.f34463l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f34463l = 1;
                    if (AbstractC8532l.purchase(5000L, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "triggerFocusTimeout: completing with focus result unsuccessful after 5000 ms");
                }
                c9426l.m3885new(new C12287l(false));
                return Unit.INSTANCE;
            default:
                int i4 = this.f34463l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f34463l = 1;
                    Object objFirebase = c9426l.firebase(this);
                    return objFirebase == enumC9342l ? enumC9342l : objFirebase;
                }
                if (i4 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34462l;
        C9426l c9426l = this.f34461l;
        switch (i) {
            case 0:
                return new C17680l(c9426l, interfaceC14029l, 0);
            case 1:
                return new C17680l(c9426l, interfaceC14029l, 1);
            default:
                return new C17680l(c9426l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34462l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C17680l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
