package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14272l extends AbstractC13244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Iterator f27946l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final HashSet f27947l = new HashSet();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function1 f27948l;

    public C14272l(Iterator it, Function1 function1) {
        this.f27946l = it;
        this.f27948l = function1;
    }

    @Override // defpackage.AbstractC13244l
    public final void yandex() {
        Object next;
        do {
            Iterator it = this.f27946l;
            if (!it.hasNext()) {
                this.f26017l = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f27947l.add(this.f27948l.invoke(next)));
        this.f26016l = next;
        this.f26017l = 1;
    }
}
