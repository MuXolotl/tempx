package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4795l implements InterfaceC13012l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f9837l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f9838l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC1122l f9839l;

    public C4795l(InterfaceC1122l interfaceC1122l, List list, int i) {
        this.f9839l = interfaceC1122l;
        this.f9838l = list;
        this.f9837l = i;
    }

    @Override // defpackage.InterfaceC13012l
    public final boolean Signature() {
        return (this.f9837l & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4795l)) {
            return false;
        }
        C4795l c4795l = (C4795l) obj;
        return AbstractC8576l.yandex(this.f9839l, c4795l.f9839l) && AbstractC8576l.yandex(this.f9838l, c4795l.f9838l) && this.f9837l == c4795l.f9837l;
    }

    @Override // defpackage.InterfaceC6017l
    public final List getAnnotations() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        return AbstractC14814l.admob(this.f9839l.hashCode() * 31, 31, this.f9838l) + this.f9837l;
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final InterfaceC1122l mo1616package() {
        return this.f9839l;
    }

    public final String subs(boolean z) {
        String name;
        InterfaceC1122l interfaceC1122l = this.f9839l;
        InterfaceC1388l interfaceC1388l = interfaceC1122l instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122l : null;
        Class clsMo1730private = interfaceC1388l != null ? ((InterfaceC13937l) interfaceC1388l).mo1730private() : null;
        if (clsMo1730private == null) {
            name = interfaceC1122l.toString();
        } else if ((this.f9837l & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsMo1730private.isArray()) {
            name = (z && clsMo1730private.isPrimitive()) ? AbstractC16131l.mopub((InterfaceC1388l) interfaceC1122l).getName() : clsMo1730private.getName();
        } else if (clsMo1730private.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsMo1730private.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsMo1730private.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsMo1730private.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsMo1730private.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsMo1730private.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsMo1730private.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsMo1730private.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        return AbstractC9361l.pro(name, this.f9838l.isEmpty() ? "" : AbstractC16901l.m4210case(this.f9838l, ", ", "<", ">", new C12176l(this), 24), Signature() ? "?" : "");
    }

    @Override // defpackage.InterfaceC13012l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final List mo1617throws() {
        return this.f9838l;
    }

    public final String toString() {
        return subs(false).concat(" (Kotlin reflection is not available)");
    }
}
