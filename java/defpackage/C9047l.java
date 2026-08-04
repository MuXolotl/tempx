package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9047l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11120l f18632l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18633l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f18634l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9047l(C11120l c11120l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18633l = i;
        this.f18632l = c11120l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object c5512l;
        int i = this.f18633l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C11120l c11120l = this.f18632l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f18634l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f18634l = 1;
                    Object objYandex = C11120l.yandex(c11120l, this);
                    return objYandex == enumC9342l ? enumC9342l : objYandex;
                }
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f18634l;
                try {
                    if (i3 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C0462l c0462l = c11120l.remoteconfig;
                        C9047l c9047l = new C9047l(c11120l, interfaceC14029l, 0);
                        this.f18634l = 1;
                        obj = AbstractC10999l.firebase(c0462l, c9047l, this);
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i3 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c5512l = (AbstractC8727l) obj;
                    break;
                } catch (C14930l e) {
                    c5512l = new C8557l(e.f29384l);
                } catch (CancellationException unused) {
                    c5512l = new C5512l();
                } catch (Throwable th) {
                    C14513l.tapsense().ads(AbstractC6037l.yandex, "Unexpected error in WorkerWrapper", th);
                    c5512l = new C5512l();
                }
                return c11120l.admob.remoteconfig(new CallableC4082l(c5512l, c11120l, 3));
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18633l;
        C11120l c11120l = this.f18632l;
        switch (i) {
            case 0:
                return new C9047l(c11120l, interfaceC14029l, 0);
            default:
                return new C9047l(c11120l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18633l) {
            case 0:
                break;
        }
        return ((C9047l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
