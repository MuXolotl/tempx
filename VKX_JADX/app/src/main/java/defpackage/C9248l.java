package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: lٍؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9248l implements InterfaceC1554l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InputContentInfo f19017l;

    public C9248l(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f19017l = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.InterfaceC1554l
    public final Uri amazon() {
        return this.f19017l.getContentUri();
    }

    @Override // defpackage.InterfaceC1554l
    public final void mopub() {
        this.f19017l.requestPermission();
    }

    @Override // defpackage.InterfaceC1554l
    public final Uri subs() {
        return this.f19017l.getLinkUri();
    }

    @Override // defpackage.InterfaceC1554l
    public final Object vip() {
        return this.f19017l;
    }

    @Override // defpackage.InterfaceC1554l
    public final ClipDescription yandex() {
        return this.f19017l.getDescription();
    }

    public C9248l(Object obj) {
        this.f19017l = (InputContentInfo) obj;
    }
}
