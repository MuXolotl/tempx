package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: renamed from: lٍٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16300l extends Permission {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashSet f31891l;

    public C16300l(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f31891l = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16300l) && this.f31891l.equals(((C16300l) obj).f31891l);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.f31891l.toString();
    }

    public final int hashCode() {
        return this.f31891l.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C16300l)) {
            return false;
        }
        C16300l c16300l = (C16300l) permission;
        return getName().equals(c16300l.getName()) || this.f31891l.containsAll(c16300l.f31891l);
    }
}
