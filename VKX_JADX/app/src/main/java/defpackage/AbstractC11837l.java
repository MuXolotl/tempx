package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lِٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11837l extends AbstractC11678l implements InterfaceC0308l, InterfaceC15969l {
    public List subs = new ArrayList();
    public HashSet isPro = null;
    public String firebase = null;
    public HashSet smaato = null;
    public HashSet remoteconfig = null;

    @Override // defpackage.InterfaceC15969l
    public final void admob(String str) {
        this.firebase = str;
    }

    @Override // defpackage.InterfaceC15969l
    public final void amazon(HashSet hashSet) {
        this.isPro = hashSet;
    }

    @Override // defpackage.InterfaceC15969l
    public final Set billing() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC0308l
    public final List getChildren() {
        return this.subs;
    }

    @Override // defpackage.InterfaceC15969l
    public final String loadAd() {
        return this.firebase;
    }

    @Override // defpackage.InterfaceC15969l
    public final void mopub(HashSet hashSet) {
        this.remoteconfig = hashSet;
    }

    @Override // defpackage.InterfaceC0308l
    public void purchase(AbstractC15046l abstractC15046l) {
        this.subs.add(abstractC15046l);
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
        return null;
    }

    @Override // defpackage.InterfaceC15969l
    public final void isPro(HashSet hashSet) {
    }
}
