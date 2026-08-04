package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘۥۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6094l extends AbstractC16840l {
    public final /* synthetic */ Function1 amazon;
    public final /* synthetic */ Set crashlytics;
    public final /* synthetic */ InterfaceC17477l loadAd;

    public C6094l(InterfaceC17477l interfaceC17477l, Set set, Function1 function1) {
        this.loadAd = interfaceC17477l;
        this.crashlytics = set;
        this.amazon = function1;
    }

    @Override // defpackage.AbstractC16840l
    public final boolean amazon(Object obj) {
        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) obj;
        if (interfaceC17477l == this.loadAd) {
            return true;
        }
        InterfaceC7637l interfaceC7637lMo756new = interfaceC17477l.mo756new();
        if (!(interfaceC7637lMo756new instanceof AbstractC8168l)) {
            return true;
        }
        this.crashlytics.addAll((Collection) this.amazon.invoke(interfaceC7637lMo756new));
        return false;
    }

    @Override // defpackage.AbstractC16840l
    public final /* bridge */ /* synthetic */ Object billing() {
        return Unit.INSTANCE;
    }
}
