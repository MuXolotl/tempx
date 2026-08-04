package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: lَۢ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC10659l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21626l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21627l;

    public /* synthetic */ ViewOnClickListenerC10659l(int i, Object obj) {
        this.f21627l = i;
        this.f21626l = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.f21627l;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.f21626l;
        switch (i) {
            case 0:
                ((AbstractC12048l) obj).loadAd();
                break;
            case 1:
                C14126l c14126l = (C14126l) obj;
                if (view == c14126l.subs && (message3 = c14126l.firebase) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == c14126l.smaato && (message2 = c14126l.vip) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == c14126l.metrica && (message = c14126l.adcel) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c14126l.inmobi.obtainMessage(1, c14126l.loadAd).sendToTarget();
                break;
            default:
                C6236l c6236l = ((Toolbar) obj).f240l;
                C17858l c17858l = c6236l != null ? c6236l.f13167l : null;
                if (c17858l != null) {
                    c17858l.collapseActionView();
                }
                break;
        }
    }
}
