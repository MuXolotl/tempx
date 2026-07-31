package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13260l extends AbstractC10553l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f26033l;

    public C13260l(C17398l c17398l) {
        this.f26033l = c17398l;
    }

    @Override // defpackage.AbstractC10553l
    public final void applovin(InterfaceC0589l interfaceC0589l) {
        C12246l c12246l = (C12246l) interfaceC0589l;
        MaterialButton materialButton = c12246l.f24303l;
        AbstractC5833l.subs(materialButton);
        final C17398l c17398l = this.f26033l;
        final int i = 0;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: lًٍؔ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                C17398l c17398l2 = c17398l;
                switch (i2) {
                    case 0:
                        AudioPlaylist audioPlaylist = c17398l2.f33899l;
                        if (audioPlaylist != null) {
                            c17398l2.m4125private(new C7721l(new C0889l(audioPlaylist, Math.abs(AbstractC4777l.f9804l.amazon()), null)));
                            break;
                        }
                        break;
                    default:
                        if (c17398l2.f33899l != null) {
                            new C2603l(AbstractC14770l.mopub(c17398l2.f33899l) ? new C13161l(c17398l2.f33899l) : new C7972l(28, c17398l2.f33899l), new C1712l(25), new C1712l(26)).Signature(c17398l2.isVip());
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        c12246l.f24301l.setOnClickListener(new View.OnClickListener() { // from class: lًٍؔ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                C17398l c17398l2 = c17398l;
                switch (i3) {
                    case 0:
                        AudioPlaylist audioPlaylist = c17398l2.f33899l;
                        if (audioPlaylist != null) {
                            c17398l2.m4125private(new C7721l(new C0889l(audioPlaylist, Math.abs(AbstractC4777l.f9804l.amazon()), null)));
                            break;
                        }
                        break;
                    default:
                        if (c17398l2.f33899l != null) {
                            new C2603l(AbstractC14770l.mopub(c17398l2.f33899l) ? new C13161l(c17398l2.f33899l) : new C7972l(28, c17398l2.f33899l), new C1712l(25), new C1712l(26)).Signature(c17398l2.isVip());
                            break;
                        }
                        break;
                }
            }
        });
        c12246l.f24300l.setOnClickListener(new View.OnClickListener(this) { // from class: lِؔؒ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13260l f5552l;

            {
                this.f5552l = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                C13260l c13260l = this.f5552l;
                switch (i3) {
                    case 0:
                        c13260l.appmetrica(false);
                        break;
                    default:
                        c13260l.appmetrica(true);
                        break;
                }
            }
        });
        c12246l.f24304l.setOnClickListener(new View.OnClickListener(this) { // from class: lِؔؒ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13260l f5552l;

            {
                this.f5552l = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                C13260l c13260l = this.f5552l;
                switch (i3) {
                    case 0:
                        c13260l.appmetrica(false);
                        break;
                    default:
                        c13260l.appmetrica(true);
                        break;
                }
            }
        });
        C7206l.yandex.yandex(materialButton, EnumC10788l.f21809l);
    }

    public final void appmetrica(boolean z) {
        C17398l c17398l = this.f26033l;
        C11827l c11827l = c17398l.f33891l;
        if (c11827l != null) {
            AbstractC9092l.crashlytics((AppActivity) c17398l.isVip(), c11827l, new C13305l(null, 0L, null, false, true, z, 79));
        }
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.v7_playlist_header_hero_buttons;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.v7_playlist_header_hero_buttons, viewGroup, false);
        int i = R.id.hero_mixes;
        MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.hero_mixes);
        if (materialButton != null) {
            i = R.id.hero_play;
            MaterialButton materialButton2 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.hero_play);
            if (materialButton2 != null) {
                i = R.id.hero_shuffle;
                MaterialButton materialButton3 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.hero_shuffle);
                if (materialButton3 != null) {
                    i = R.id.hero_snippets;
                    MaterialButton materialButton4 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.hero_snippets);
                    if (materialButton4 != null) {
                        return new C12246l((LinearLayout) viewInflate, materialButton, materialButton2, materialButton3, materialButton4);
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
