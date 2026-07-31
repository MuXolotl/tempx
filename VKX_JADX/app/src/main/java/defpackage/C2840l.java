package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: lؔۗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2840l extends AbstractDialogInterfaceOnClickListenerC12427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f6189l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Activity f6190l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ Intent f6191l;

    public C2840l(Intent intent, Activity activity, int i) {
        this.f6191l = intent;
        this.f6190l = activity;
        this.f6189l = i;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC12427l
    public final void yandex() {
        Intent intent = this.f6191l;
        if (intent != null) {
            this.f6190l.startActivityForResult(intent, this.f6189l);
        }
    }
}
