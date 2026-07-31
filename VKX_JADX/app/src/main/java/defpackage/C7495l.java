package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚۚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7495l extends AbstractC14971l implements InterfaceC16036l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Function1 f15499l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Function1 f15500l;

    @Override // defpackage.InterfaceC16036l
    /* JADX INFO: renamed from: strictfp */
    public final boolean mo1515strictfp(KeyEvent keyEvent) {
        Function1 function1 = this.f15500l;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C18583l(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.InterfaceC16036l
    public final boolean vip(KeyEvent keyEvent) {
        Function1 function1 = this.f15499l;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new C18583l(keyEvent))).booleanValue();
        }
        return false;
    }
}
