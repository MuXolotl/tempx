package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: l٘ۘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC18156l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f35553l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35554l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35555l;

    public /* synthetic */ ViewOnClickListenerC18156l(Catalog2Button catalog2Button, C2979l c2979l) {
        this.f35555l = 2;
        this.f35553l = catalog2Button;
        this.f35554l = c2979l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35555l;
        Object obj = this.f35553l;
        Object obj2 = this.f35554l;
        switch (i) {
            case 0:
                C14100l.yandex(((C15544l) obj2).f30384l.getContext(), (Catalog2Button) obj);
                break;
            case 1:
                AbstractC1213l.crashlytics(view, new C16467l(((Conversation) obj2).yandex.yandex, ((C0529l) obj).license.getText().toString()));
                break;
            case 2:
                Catalog2Button catalog2Button = (Catalog2Button) obj;
                C2979l c2979l = (C2979l) obj2;
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button.yandex;
                if (catalog2ButtonAction instanceof C0333l) {
                    new C10038l(view, new C3005l(catalog2Button, c2979l, 17)).m2854l();
                    break;
                } else if (!(catalog2ButtonAction instanceof C2173l)) {
                    if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                        ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).amazon.invoke(view.getContext());
                    }
                    break;
                } else {
                    Context context = view.getContext();
                    String strM2722l = c2979l.f6486l.m2722l();
                    int i2 = 0;
                    if (!(catalog2ButtonAction instanceof C2173l) && !(catalog2ButtonAction instanceof C15196l)) {
                        if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
                            C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
                        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                            ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).amazon.invoke(context);
                        }
                        break;
                    } else {
                        String str = catalog2Button.loadAd;
                        if (str != null) {
                            AbstractC1213l.billing(context, new C15191l(str, new C9810l(str, strM2722l, i2)));
                            break;
                        }
                    }
                }
                break;
            case 3:
                NextDockView nextDockView = (NextDockView) obj2;
                int iIndexOf = nextDockView.f36849l.indexOf((C9359l) obj);
                boolean z = true;
                nextDockView.post(new RunnableC10505l(iIndexOf, nextDockView, z, z));
                break;
            default:
                SmartSuggestion smartSuggestion = (SmartSuggestion) obj2;
                InterfaceC1982l interfaceC1982l = ((C3815l) obj).f7925l;
                boolean zYandex = AbstractC8576l.yandex(smartSuggestion.crashlytics, "synth_fc");
                String str2 = smartSuggestion.amazon;
                String str3 = smartSuggestion.yandex;
                if (zYandex || interfaceC1982l.amazon()) {
                    interfaceC1982l.license(str3);
                } else {
                    interfaceC1982l.getClass();
                    if (str3 == null) {
                        str3 = "";
                    }
                    AbstractC1213l.crashlytics(view, new C15288l(str2, str3));
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC18156l(Object obj, Object obj2, int i) {
        this.f35555l = i;
        this.f35554l = obj;
        this.f35553l = obj2;
    }
}
