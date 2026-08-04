package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.metrica;
import androidx.recyclerview.widget.subs;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatPhoto;
import ua.itaysonlab.vkapi2.objects.message.ConversationChatSettings;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: l٘ٚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18022l extends subs {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C11473l f35228l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public LayoutInflater f35229l;

    public C18022l(C11473l c11473l) {
        this.f35228l = c11473l;
    }

    @Override // androidx.recyclerview.widget.subs
    public final void ads(metrica metricaVar, int i) {
        C0529l c0529l = (C0529l) metricaVar;
        Integer numValueOf = Integer.valueOf(R.drawable.placeholder_link);
        View view = c0529l.yandex;
        TextView textView = c0529l.license;
        ImageView imageView = c0529l.Signature;
        C11473l c11473l = this.f35228l;
        Conversation conversation = (Conversation) c11473l.f23170l.get(i);
        ConversationChatSettings conversationChatSettings = conversation.loadAd;
        Object obj = null;
        if (conversationChatSettings != null) {
            ConversationChatPhoto conversationChatPhoto = conversationChatSettings.loadAd;
            AbstractC17891l.crashlytics(imageView, conversationChatPhoto != null ? conversationChatPhoto.yandex : null, numValueOf, new C10923l(new C16849l(), 14));
            textView.setText(conversation.loadAd.yandex);
        } else {
            for (Object obj2 : c11473l.f23059l) {
                if (((VKProfile) obj2).yandex == conversation.yandex.yandex) {
                    obj = obj2;
                    break;
                }
            }
            VKProfile vKProfile = (VKProfile) obj;
            if (vKProfile == null) {
                vKProfile = VKProfile.admob;
            }
            AbstractC17891l.crashlytics(imageView, vKProfile.amazon, numValueOf, new C10923l(new C16849l(), 14));
            textView.setText(vKProfile.yandex());
        }
        VKXApplication.Companion companion = VKXApplication.f36628l;
        view.setPadding(VKXApplication.Companion.yandex(16.0f), view.getPaddingTop(), VKXApplication.Companion.yandex(16.0f), view.getPaddingBottom());
        view.setOnClickListener(new ViewOnClickListenerC18156l(conversation, c0529l, 1));
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return this.f35228l.f23170l.size();
    }

    @Override // androidx.recyclerview.widget.subs
    public final metrica tapsense(ViewGroup viewGroup, int i) {
        if (this.f35229l == null) {
            this.f35229l = LayoutInflater.from(viewGroup.getContext());
        }
        return new C0529l(this.f35229l.inflate(R.layout.catalog_vertical_item, viewGroup, false));
    }
}
