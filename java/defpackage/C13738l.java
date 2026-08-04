package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْۢؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13738l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14275l f26816l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26817l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26818l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13738l(C14275l c14275l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f26817l = i;
        this.f26816l = c14275l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        switch (this.f26817l) {
            case 0:
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                int i = this.f26818l;
                if (i == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7647l c7647l = this.f26816l.f27955l;
                    C4812l c4812l = new C4812l(8);
                    synchronized (c7647l.yandex) {
                        try {
                            if (!c7647l.mopub) {
                                if (AbstractC5088l.firebase("CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                c7647l.mopub = true;
                                EnumC10062l enumC10062l = EnumC10062l.f20529l;
                                c7647l.purchase = enumC10062l;
                                c7647l.billing = c4812l;
                                c7647l.crashlytics(enumC10062l, c4812l);
                                c7647l.amazon = null;
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    C15252l c15252l = this.f26816l.f27954l;
                    this.f26818l = 1;
                    if (c15252l.purchase(this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C14275l c14275l = this.f26816l;
                EnumC9342l enumC9342l2 = EnumC9342l.f19165l;
                int i2 = this.f26818l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15252l c15252l2 = c14275l.f27954l;
                    this.f26818l = 1;
                    if (c15252l2.purchase(this) == enumC9342l2) {
                        return enumC9342l2;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                AbstractC11990l.billing(c14275l.f27956l.yandex, null);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f26817l;
        C14275l c14275l = this.f26816l;
        switch (i) {
            case 0:
                return new C13738l(c14275l, interfaceC14029l, 0);
            default:
                return new C13738l(c14275l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f26817l) {
            case 0:
                break;
        }
        return ((C13738l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
