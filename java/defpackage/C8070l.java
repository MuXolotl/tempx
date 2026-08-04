package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8070l implements InterfaceC14665l {
    public static final C8070l crashlytics = new C8070l();

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        return null;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean contains(String str) {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC14665l) && ((InterfaceC14665l) obj).isEmpty();
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC18742l
    public final /* bridge */ void isVip(Function2 function2) {
        AbstractC0653l.amazon(this, function2);
    }

    @Override // defpackage.InterfaceC18742l
    public final Set mopub() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        return null;
    }

    public final String toString() {
        return "Parameters " + C5746l.f12138l;
    }
}
