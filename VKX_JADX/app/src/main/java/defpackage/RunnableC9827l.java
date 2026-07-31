package defpackage;

/* JADX INFO: renamed from: lٍؙۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9827l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2956l f20017l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20018l;

    public /* synthetic */ RunnableC9827l(C2956l c2956l, int i) {
        this.f20018l = i;
        this.f20017l = c2956l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f20018l;
        C2956l c2956l = this.f20017l;
        switch (i) {
            case 0:
                C9945l c9945l = c2956l.f6419l;
                if (c9945l != null) {
                    c9945l.setListSelectionHidden(true);
                    c9945l.requestLayout();
                }
                break;
            default:
                C9945l c9945l2 = c2956l.f6419l;
                if (c9945l2 != null && c9945l2.isAttachedToWindow() && c2956l.f6419l.getCount() > c2956l.f6419l.getChildCount() && c2956l.f6419l.getChildCount() <= c2956l.f6418l) {
                    c2956l.f6435l.setInputMethodMode(2);
                    c2956l.mopub();
                    break;
                }
                break;
        }
    }
}
