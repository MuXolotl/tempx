package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11830l extends AbstractC5555l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C10227l f23663l = appmetrica();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17398l f23664l;

    public C11830l(C17398l c17398l) {
        this.f23664l = c17398l;
    }

    public final void applovin(EnumC13576l enumC13576l, C13109l c13109l) {
        c13109l.f25638l.setText(enumC13576l.f26592l);
        TextView textView = c13109l.f25638l;
        int i = enumC13576l.f26591l;
        textView.setTextColor(AbstractC13209l.yandex(i));
        ImageView imageView = c13109l.f25636l;
        imageView.setImageResource(enumC13576l.f26593l);
        imageView.setImageTintList(ColorStateList.valueOf(AbstractC13209l.yandex(i)));
        c13109l.f25635l.setOnClickListener(new ViewOnClickListenerC0664l(this, c13109l, enumC13576l, 5));
    }

    public final C10227l appmetrica() {
        EnumC13576l enumC13576l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AudioPlaylist audioPlaylist = this.f23664l.f33899l;
        if (!AbstractC14770l.isPro(audioPlaylist)) {
            AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36623throws;
            if (audioPlaylistPermissions == null || !audioPlaylistPermissions.amazon) {
                enumC13576l = AbstractC14770l.subs(audioPlaylist) ? EnumC13576l.REMOVE : EnumC13576l.ADD;
            } else {
                enumC13576l = EnumC13576l.EDIT;
            }
            c10227lAdmob.add(enumC13576l);
        }
        C7268l.f15111l.getClass();
        if (C7268l.amazon(audioPlaylist)) {
            c10227lAdmob.add(EnumC13576l.DELETE_CACHE);
        } else {
            c10227lAdmob.add(EnumC13576l.CACHE);
        }
        c10227lAdmob.add(EnumC13576l.PLAY_NEXT);
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        applovin((EnumC13576l) this.f23663l.get(i), (C13109l) interfaceC0589l);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return this.f23663l.pro();
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.v7_playlist_header_buttonbar;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.v7_playlist_header_buttonbar, viewGroup, false);
        int i = R.id.bb_icon;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.bb_icon);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.bb_title);
            if (textView != null) {
                return new C13109l(linearLayout, imageView, linearLayout, textView);
            }
            i = R.id.bb_title;
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
