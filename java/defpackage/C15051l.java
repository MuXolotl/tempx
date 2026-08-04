package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15051l extends AbstractC10553l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f29571l;

    public C15051l(C17398l c17398l) {
        this.f29571l = c17398l;
    }

    @Override // defpackage.AbstractC10553l
    public final void applovin(InterfaceC0589l interfaceC0589l) {
        int i;
        String strPurchase;
        Long l;
        TextView textView = ((C17976l) interfaceC0589l).f35144l;
        C17398l c17398l = this.f29571l;
        String str = c17398l.f33897l;
        if (str != null && str.length() != 0) {
            textView.setText(c17398l.f33897l);
            return;
        }
        Iterator it = c17398l.m4322implements().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) ((AudioTrack) it.next()).purchase;
        }
        Resources resources = textView.getResources();
        Context context = textView.getContext();
        AudioPlaylist audioPlaylist = c17398l.f33899l;
        String strAmazon = AbstractC7076l.amazon(context, audioPlaylist != null ? audioPlaylist.smaato : 0L);
        Context context2 = textView.getContext();
        AudioPlaylist audioPlaylist2 = c17398l.f33899l;
        String string = resources.getString(R.string.playlist_alt_footer, strAmazon, AbstractC7076l.amazon(context2, (audioPlaylist2 == null || (l = audioPlaylist2.remoteconfig) == null) ? 0L : l.longValue()));
        if (j > 0) {
            Resources resources2 = textView.getResources();
            String strPurchase2 = AbstractC14205l.purchase(textView.getResources(), R.plurals.tracks, c17398l.m4322implements().size());
            Resources resources3 = textView.getResources();
            int i2 = (int) (j / 3600);
            if (i2 > 0) {
                i = 0;
                int i3 = (int) ((j - (((long) i2) * 3600)) / 60);
                strPurchase = AbstractC14205l.purchase(resources3, R.plurals.music_hours, i2);
                if (i3 > 0) {
                    strPurchase = strPurchase + ' ' + AbstractC14205l.purchase(resources3, R.plurals.music_minutes, i3);
                }
            } else {
                i = 0;
                int i4 = (int) (j / 60);
                strPurchase = i4 > 0 ? AbstractC14205l.purchase(resources3, R.plurals.music_minutes, i4) : "";
            }
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            DecimalFormat decimalFormat = C15638l.yandex;
            AudioPlaylist audioPlaylist3 = c17398l.f33899l;
            Object[] objArr = new Object[1];
            objArr[i] = C15638l.loadAd(audioPlaylist3 != null ? audioPlaylist3.firebase : i);
            String string2 = vKXApplication.getString(R.string.play_count, objArr);
            Object[] objArr2 = new Object[3];
            objArr2[i] = strPurchase2;
            objArr2[1] = strPurchase;
            objArr2[2] = string2;
            string = AbstractC9361l.pro(resources2.getString(R.string.separator_strings_triple_ln, objArr2), "\n\n", string);
        }
        c17398l.f33897l = string;
        textView.setText(string);
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.playlist_footer;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.playlist_footer, viewGroup, false);
        if (viewInflate != null) {
            return new C17976l((TextView) viewInflate);
        }
        C6541l.subs("rootView");
        return null;
    }
}
