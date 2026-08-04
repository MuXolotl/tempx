package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9609l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14567l f19580l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19581l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19582l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9609l(C14567l c14567l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f19581l = i;
        this.f19580l = c14567l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f19581l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C14567l c14567l = this.f19580l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i2 = this.f19582l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15796l c15796l = new C15796l(c14567l.purchase.yandex(), new C14082l(c14567l, interfaceC14029l, 6), 1);
                    C2354l c2354l = new C2354l(16, c14567l);
                    this.f19582l = 1;
                    if (c15796l.yandex(c2354l, this) == enumC9342l) {
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
                int i3 = this.f19582l;
                try {
                    if (i3 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        InterfaceC15829l interfaceC15829l = c14567l.purchase;
                        C4050l c4050l = new C4050l(c14567l, interfaceC14029l, 0);
                        this.f19582l = 1;
                        if (interfaceC15829l.loadAd(c4050l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i3 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    break;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    C6539l c6539l = c14567l.admob;
                    if (c6539l == null) {
                        c6539l = null;
                    }
                    c14567l.admob = C6539l.yandex(c6539l, null, c14567l.amazon.yandex(), null, 5);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f19581l;
        C14567l c14567l = this.f19580l;
        switch (i) {
            case 0:
                return new C9609l(c14567l, interfaceC14029l, 0);
            default:
                return new C9609l(c14567l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f19581l) {
            case 0:
                break;
        }
        return ((C9609l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
