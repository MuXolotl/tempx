package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4957l extends AbstractC5662l {
    public static final /* synthetic */ InterfaceC13922l[] amazon = {new C0544l(AbstractC4957l.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final C2278l crashlytics;
    public final AbstractC10170l loadAd;

    public AbstractC4957l(C16412l c16412l, AbstractC10170l abstractC10170l) {
        this.loadAd = abstractC10170l;
        this.crashlytics = new C2278l(c16412l, new C7646l(22, this));
    }

    public abstract List admob();

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC13922l interfaceC13922l = amazon[0];
        List list = (List) this.crashlytics.invoke();
        if (list.isEmpty()) {
            return C2580l.f5619l;
        }
        C5047l c5047l = new C5047l();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC10696l) && AbstractC8576l.yandex(((InterfaceC10696l) obj).getName(), c3498l)) {
                c5047l.add(obj);
            }
        }
        return c5047l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        if (!c18186l.yandex(C18186l.vip.loadAd)) {
            return C2580l.f5619l;
        }
        InterfaceC13922l interfaceC13922l = amazon[0];
        return (List) this.crashlytics.invoke();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC13922l interfaceC13922l = amazon[0];
        List list = (List) this.crashlytics.invoke();
        if (list.isEmpty()) {
            return C2580l.f5619l;
        }
        C5047l c5047l = new C5047l();
        for (Object obj : list) {
            if ((obj instanceof C17134l) && AbstractC8576l.yandex(((C17134l) obj).getName(), c3498l)) {
                c5047l.add(obj);
            }
        }
        return c5047l;
    }
}
