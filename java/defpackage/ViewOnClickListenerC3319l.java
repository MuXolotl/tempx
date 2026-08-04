package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: lُٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3319l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18434l f7076l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11518l f7077l;

    public ViewOnClickListenerC3319l(C18434l c18434l) {
        this.f7076l = c18434l;
        Context context = c18434l.yandex.getContext();
        CharSequence charSequence = c18434l.admob;
        C11518l c11518l = new C11518l();
        c11518l.f23150l = 4096;
        c11518l.f23143l = 4096;
        c11518l.f23152l = null;
        c11518l.f23141l = null;
        c11518l.f23156l = false;
        c11518l.f23149l = false;
        c11518l.f23145l = 16;
        c11518l.f23153l = context;
        c11518l.f23147l = charSequence;
        this.f7077l = c11518l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18434l c18434l = this.f7076l;
        Window.Callback callback = c18434l.firebase;
        if (callback == null || !c18434l.smaato) {
            return;
        }
        callback.onMenuItemSelected(0, this.f7077l);
    }
}
