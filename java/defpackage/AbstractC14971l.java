package defpackage;

/* JADX INFO: renamed from: lٟٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14971l implements InterfaceC8605l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C4307l f29449l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f29450l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C15966l f29451l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC18026l f29452l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C18662l f29453l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f29455l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AbstractC14971l f29456l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f29458l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f29459l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC14971l f29460l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f29461l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f29462l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC14971l f29454l = this;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f29457l = -1;

    /* JADX INFO: renamed from: lؙؔؑ */
    public void mo3065l() {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("Cannot detach a node that is not attached");
        }
        if (this.f29461l) {
            AbstractC0081l.crashlytics("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f29458l) {
            AbstractC0081l.crashlytics("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f29462l = false;
        C18662l c18662l = this.f29453l;
        if (c18662l != null) {
            AbstractC11990l.billing(c18662l, new C3036l("The Modifier.Node was detached", 2));
            this.f29453l = null;
        }
    }

    /* JADX INFO: renamed from: lٖؖ۠ */
    public void mo3066l() {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f29461l) {
            AbstractC0081l.crashlytics("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f29461l = false;
        mo511l();
        this.f29458l = true;
    }

    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo3067l() {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("reset() called on an unattached node");
        }
        mo513l();
    }

    /* JADX INFO: renamed from: lٍؘؘ */
    public void mo3068l() {
        if (!this.f29462l) {
            AbstractC0081l.crashlytics("node detached multiple times");
        }
        if (this.f29452l == null) {
            AbstractC0081l.crashlytics("detach invoked on a node without a coordinator");
        }
        if (!this.f29458l) {
            AbstractC0081l.crashlytics("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f29458l = false;
        C4307l c4307l = this.f29449l;
        if (c4307l != null) {
            c4307l.invoke();
        }
        mo535l();
    }

    /* JADX INFO: renamed from: lؙٗۛ */
    public boolean mo512l() {
        return !(this instanceof C7600l);
    }

    /* JADX INFO: renamed from: lؙ۟ٙ */
    public void mo3070l() {
        if (this.f29462l) {
            AbstractC0081l.crashlytics("node attached multiple times");
        }
        if (this.f29452l == null) {
            AbstractC0081l.crashlytics("attach invoked on a node without a coordinator");
        }
        this.f29462l = true;
        this.f29461l = true;
    }

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final InterfaceC2262l m3914l() {
        C18662l c18662l = this.f29453l;
        if (c18662l != null) {
            return c18662l;
        }
        C18662l c18662lYandex = AbstractC11990l.yandex(((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getCoroutineContext().mo246l(new C0462l((InterfaceC7042l) ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(this)).getCoroutineContext().mo245l(C1083l.f2996l))));
        this.f29453l = c18662lYandex;
        return c18662lYandex;
    }

    /* JADX INFO: renamed from: lٖۥۡ */
    public void mo3072l(AbstractC18026l abstractC18026l) {
        this.f29452l = abstractC18026l;
    }

    /* JADX INFO: renamed from: lْٗٔ */
    public void mo3074l(AbstractC14971l abstractC14971l) {
        this.f29454l = abstractC14971l;
    }

    /* JADX INFO: renamed from: lؘؓؖ */
    public void mo535l() {
    }

    /* JADX INFO: renamed from: lّؗؑ */
    public void mo511l() {
    }

    /* JADX INFO: renamed from: lٍؚۖ */
    public /* synthetic */ void mo1495l() {
    }

    /* JADX INFO: renamed from: lًٚٔ */
    public void mo513l() {
    }

    /* JADX INFO: renamed from: lٕٕۤ */
    public /* synthetic */ void mo1962l() {
    }
}
