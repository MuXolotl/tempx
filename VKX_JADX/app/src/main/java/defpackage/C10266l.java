package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10266l extends AbstractC9694l {

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public final C3664l f20899l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public final boolean f20900l;

    public C10266l(Function0 function0) {
        super(null);
        this.f20900l = true;
        this.f20899l = new C3664l(function0, this, 1);
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: class */
    public final boolean mo1142class() {
        return this.f20900l;
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: final */
    public final void mo852final() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        ((C3497l) abstractC14412l).mopub.setBackgroundResource(R.drawable.scrim_top);
    }

    @Override // defpackage.AbstractC9694l
    /* JADX INFO: renamed from: return */
    public final Cgoto mo781return() {
        return this.f20899l;
    }
}
