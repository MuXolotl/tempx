package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؖؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3901l extends AbstractC11678l implements InterfaceC8761l, InterfaceC15969l {
    public Matrix vip;
    public HashSet subs = null;
    public String isPro = null;
    public HashSet firebase = null;
    public HashSet smaato = null;
    public HashSet remoteconfig = null;

    @Override // defpackage.InterfaceC15969l
    public final void admob(String str) {
        this.isPro = str;
    }

    @Override // defpackage.InterfaceC15969l
    public final void amazon(HashSet hashSet) {
        this.subs = hashSet;
    }

    @Override // defpackage.InterfaceC15969l
    public final Set billing() {
        return this.subs;
    }

    @Override // defpackage.InterfaceC8761l
    public final void firebase(Matrix matrix) {
        this.vip = matrix;
    }

    @Override // defpackage.InterfaceC15969l
    public final void isPro(HashSet hashSet) {
        this.firebase = hashSet;
    }

    @Override // defpackage.InterfaceC15969l
    public final String loadAd() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC15969l
    public final void mopub(HashSet hashSet) {
        this.remoteconfig = hashSet;
    }

    @Override // defpackage.InterfaceC15969l
    public final Set remoteconfig() {
        return this.remoteconfig;
    }

    @Override // defpackage.InterfaceC15969l
    public final Set smaato() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC15969l
    public final void subs(HashSet hashSet) {
        this.smaato = hashSet;
    }

    @Override // defpackage.InterfaceC15969l
    public final Set yandex() {
        return this.firebase;
    }
}
