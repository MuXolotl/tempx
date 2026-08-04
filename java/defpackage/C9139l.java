package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۢۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9139l implements InterfaceC14665l, InterfaceC18742l {
    public final List amazon;
    public final String crashlytics;

    public C9139l(String str, List list) {
        this.crashlytics = str;
        this.amazon = list;
    }

    @Override // defpackage.InterfaceC18742l
    public final List advert(String str) {
        if (this.crashlytics.equalsIgnoreCase(str)) {
            return this.amazon;
        }
        return null;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean contains(String str) {
        return "a".equalsIgnoreCase(this.crashlytics);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC18742l)) {
            return false;
        }
        InterfaceC18742l interfaceC18742l = (InterfaceC18742l) obj;
        if (true != interfaceC18742l.pro()) {
            return false;
        }
        return mopub().equals(interfaceC18742l.mopub());
    }

    public final int hashCode() {
        return mopub().hashCode() + 1182991;
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC18742l
    public final void isVip(Function2 function2) {
        function2.invoke(this.crashlytics, this.amazon);
    }

    @Override // defpackage.InterfaceC18742l
    public final Set mopub() {
        return Collections.singleton(new C16276l(this));
    }

    @Override // defpackage.InterfaceC18742l
    public final Set names() {
        return Collections.singleton(this.crashlytics);
    }

    @Override // defpackage.InterfaceC18742l
    public final boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC18742l
    public final String signatures(String str) {
        if ("a".equalsIgnoreCase(this.crashlytics)) {
            return (String) AbstractC16901l.m4217extends(this.amazon);
        }
        return null;
    }

    public final String toString() {
        return "Parameters " + mopub();
    }
}
