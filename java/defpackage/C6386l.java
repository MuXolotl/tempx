package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6386l implements InterfaceC12932l, Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC5763l f13366l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12932l f13367l;

    public C6386l(InterfaceC12932l interfaceC12932l, InterfaceC5763l interfaceC5763l) {
        this.f13367l = interfaceC12932l;
        this.f13366l = interfaceC5763l;
    }

    public final boolean equals(Object obj) {
        boolean zYandex;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6386l) {
            C6386l c6386l = (C6386l) obj;
            int i = 2;
            C6386l c6386l2 = c6386l;
            int i2 = 2;
            while (true) {
                InterfaceC12932l interfaceC12932l = c6386l2.f13367l;
                c6386l2 = interfaceC12932l instanceof C6386l ? (C6386l) interfaceC12932l : null;
                if (c6386l2 == null) {
                    break;
                }
                i2++;
            }
            C6386l c6386l3 = this;
            while (true) {
                InterfaceC12932l interfaceC12932l2 = c6386l3.f13367l;
                c6386l3 = interfaceC12932l2 instanceof C6386l ? (C6386l) interfaceC12932l2 : null;
                if (c6386l3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC5763l interfaceC5763l = this.f13366l;
                    if (!AbstractC8576l.yandex(c6386l.mo245l(interfaceC5763l.getKey()), interfaceC5763l)) {
                        zYandex = false;
                        break;
                    }
                    InterfaceC12932l interfaceC12932l3 = this.f13367l;
                    if (!(interfaceC12932l3 instanceof C6386l)) {
                        InterfaceC5763l interfaceC5763l2 = (InterfaceC5763l) interfaceC12932l3;
                        zYandex = AbstractC8576l.yandex(c6386l.mo245l(interfaceC5763l2.getKey()), interfaceC5763l2);
                        break;
                    }
                    this = (C6386l) interfaceC12932l3;
                }
                if (zYandex) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13366l.hashCode() + this.f13367l.hashCode();
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        InterfaceC5763l interfaceC5763l = this.f13366l;
        InterfaceC5763l interfaceC5763lMo245l = interfaceC5763l.mo245l(interfaceC15446l);
        InterfaceC12932l interfaceC12932l = this.f13367l;
        if (interfaceC5763lMo245l != null) {
            return interfaceC12932l;
        }
        InterfaceC12932l interfaceC12932lMo244import = interfaceC12932l.mo244import(interfaceC15446l);
        if (interfaceC12932lMo244import == interfaceC12932l) {
            return this;
        }
        return interfaceC12932lMo244import == C17218l.f33421l ? interfaceC5763l : new C6386l(interfaceC12932lMo244import, interfaceC5763l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        while (true) {
            InterfaceC5763l interfaceC5763lMo245l = this.f13366l.mo245l(interfaceC15446l);
            if (interfaceC5763lMo245l != null) {
                return interfaceC5763lMo245l;
            }
            InterfaceC12932l interfaceC12932l = this.f13367l;
            if (!(interfaceC12932l instanceof C6386l)) {
                return interfaceC12932l.mo245l(interfaceC15446l);
            }
            this = (C6386l) interfaceC12932l;
        }
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final /* bridge */ InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(this.f13367l.mo247l(obj, function2), this.f13366l);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("["), (String) mo247l("", new C3755l(15)), ']');
    }
}
