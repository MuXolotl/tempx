package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: lْٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13375l extends AbstractC18135l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26246l = AtomicIntegerFieldUpdater.newUpdater(C13375l.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f26247l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14592l f26248l;

    public /* synthetic */ C13375l(InterfaceC14592l interfaceC14592l, boolean z) {
        this(interfaceC14592l, z, C17218l.f33421l, -3, 1);
    }

    @Override // defpackage.AbstractC18135l
    public final InterfaceC6942l admob() {
        return new C13375l(this.f26248l, this.f26247l);
    }

    @Override // defpackage.AbstractC18135l
    public final Object amazon(C12428l c12428l, InterfaceC14029l interfaceC14029l) throws Throwable {
        Object objAmazon = AbstractC2296l.amazon(new C7173l(c12428l), this.f26248l, this.f26247l, interfaceC14029l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC18135l
    public final String crashlytics() {
        return "channel=" + this.f26248l;
    }

    @Override // defpackage.AbstractC18135l
    public final AbstractC18135l purchase(InterfaceC12932l interfaceC12932l, int i, int i2) {
        return new C13375l(this.f26248l, this.f26247l, interfaceC12932l, i, i2);
    }

    @Override // defpackage.AbstractC18135l
    public final InterfaceC14592l subs(InterfaceC2262l interfaceC2262l) {
        if (!this.f26247l || f26246l.getAndSet(this, 1) != 1) {
            return this.f35448l == -3 ? this.f26248l : super.subs(interfaceC2262l);
        }
        C8339l.smaato("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.AbstractC18135l, defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) throws Throwable {
        int i = this.f35448l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i != -3) {
            Object objYandex = super.yandex(interfaceC9427l, interfaceC14029l);
            return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
        }
        boolean z = this.f26247l;
        if (z && f26246l.getAndSet(this, 1) == 1) {
            C8339l.smaato("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objAmazon = AbstractC2296l.amazon(interfaceC9427l, this.f26248l, z, interfaceC14029l);
        return objAmazon == enumC9342l ? objAmazon : Unit.INSTANCE;
    }

    public C13375l(InterfaceC14592l interfaceC14592l, boolean z, InterfaceC12932l interfaceC12932l, int i, int i2) {
        super(interfaceC12932l, i, i2);
        this.f26248l = interfaceC14592l;
        this.f26247l = z;
    }
}
