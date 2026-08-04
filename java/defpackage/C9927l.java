package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۤ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9927l extends AbstractC5662l {
    public static final /* synthetic */ InterfaceC13922l[] billing = {new C0544l(C9927l.class, "functions", "getFunctions()Ljava/util/List;", 0), new C0544l(C9927l.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final C2278l amazon;
    public final boolean crashlytics;
    public final C11296l loadAd;
    public final C2278l purchase;

    public C9927l(C16412l c16412l, C11296l c11296l, boolean z) {
        this.loadAd = c11296l;
        this.crashlytics = z;
        this.amazon = new C2278l(c16412l, new C14584l(this, 0));
        this.purchase = new C2278l(c16412l, new C14584l(this, 1));
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC13922l interfaceC13922l = billing[1];
        List list = (List) this.purchase.invoke();
        C5047l c5047l = new C5047l();
        for (Object obj : list) {
            if (AbstractC8576l.yandex(((InterfaceC10696l) obj).getName(), c3498l)) {
                c5047l.add(obj);
            }
        }
        return c5047l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        InterfaceC13922l[] interfaceC13922lArr = billing;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[0];
        List list = (List) this.amazon.invoke();
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[1];
        return AbstractC16901l.m4232new(list, (List) this.purchase.invoke());
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final /* bridge */ /* synthetic */ InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return null;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC13922l interfaceC13922l = billing[0];
        List list = (List) this.amazon.invoke();
        C5047l c5047l = new C5047l();
        for (Object obj : list) {
            if (AbstractC8576l.yandex(((C17134l) obj).getName(), c3498l)) {
                c5047l.add(obj);
            }
        }
        return c5047l;
    }
}
