package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13983l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC9694l f27282l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final List f27283l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f27284l = AbstractC11990l.loadAd();

    public C13983l(AbstractC9694l abstractC9694l, List list) {
        this.f27282l = abstractC9694l;
        this.f27283l = list;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.artist_header_v2c;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        Object next;
        VKProfile vKProfile = (VKProfile) obj;
        C10390l c10390l = (C10390l) interfaceC0589l;
        MaterialButton materialButton = c10390l.f21206l;
        MaterialButton materialButton2 = c10390l.f21210l;
        Iterator it = this.f27283l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Catalog2Button) next).yandex instanceof C9588l));
        Catalog2Button catalog2Button = (Catalog2Button) next;
        c10390l.f21207l.setText(vKProfile.purchase);
        c10390l.f21209l.setLayoutParams(new RelativeLayout.LayoutParams(-1, AbstractC5852l.yandex));
        int i2 = 0;
        materialButton.setVisibility(catalog2Button == null ? 8 : 0);
        materialButton.setOnClickListener(new ViewOnClickListenerC0664l(this, c10390l, catalog2Button, i2));
        Boolean bool = vKProfile.mopub;
        Boolean bool2 = Boolean.TRUE;
        if (!AbstractC8576l.yandex(bool, bool2) || vKProfile.billing == null) {
            materialButton2.setVisibility(8);
            return;
        }
        materialButton2.setVisibility(0);
        materialButton2.setIconResource(AbstractC8576l.yandex(vKProfile.billing, bool2) ? R.drawable.ic_unfavorite_outline_28 : R.drawable.ic_favorite_outline_28);
        materialButton2.setOnClickListener(new ViewOnClickListenerC0664l(this, c10390l, vKProfile, 1));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.artist_header_v2c, viewGroup, false);
        int i = R.id.artist_name;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.artist_name);
        if (textView != null) {
            i = R.id.artist_photo;
            if (((ImageView) AbstractC8576l.smaato(viewInflate, R.id.artist_photo)) != null) {
                i = R.id.artist_play;
                MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.artist_play);
                if (materialButton != null) {
                    i = R.id.artist_subscribe;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.artist_subscribe);
                    if (materialButton2 != null) {
                        i = R.id.sb_padder;
                        Space space = (Space) AbstractC8576l.smaato(viewInflate, R.id.sb_padder);
                        if (space != null) {
                            i = R.id.scrim_bottom;
                            if (AbstractC8576l.smaato(viewInflate, R.id.scrim_bottom) != null) {
                                return new C10390l((RelativeLayout) viewInflate, textView, materialButton, materialButton2, space);
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f27284l.f36440l;
    }
}
